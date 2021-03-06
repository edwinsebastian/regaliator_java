/*
 * Copyright (c) 2017, Grupo Regalii, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.regalii.regaliator.v32;

import com.regalii.regaliator.api.AbstractClient;
import com.regalii.regaliator.api.Configuration;

/**
 * Created by Geoffrey Roguelon on 17/01/2017.
 */
public class Client extends AbstractClient {
    public Client(Configuration configuration) {
        super(configuration);
    }

    public Account getAccount() {
        return new Account(configuration);
    }

    public Bill getBill() {
        return new Bill(configuration);
    }

    public Biller getBiller() {
        return new Biller(configuration);
    }

    public Rate getRate() {
        return new Rate(configuration);
    }

    public Transaction getTransaction() {
        return new Transaction(configuration);
    }
}
