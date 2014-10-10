/*
 * Copyright (c) 2014, Aalesund University College
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package no.hials.crosscom.KRL.structs;

import no.hials.crosscom.KRL.structs.KRLFrame;

/**
 * Represents a Real variable from the KRL language
 *
 * @author Lars Ivar Hatledal
 */
public class KRLPos extends KRLFrame {

    public KRLPos(String name) {
        this(name, new String[]{"X", "Y", "Z", "A", "B", "C", "S", "T"});
    }

    protected KRLPos(String name, String[] nodes) {
        super(name, nodes);
    }

    /**
     * Getter for S
     *
     * @return the value
     */
    public double getS() {
        return struct.get("S");
    }

    /**
     * Getter for T
     *
     * @return the value
     */
    public double getT() {
        return struct.get("T");
    }

    /**
     * Sets the value of 'S'
     *
     * @param d the value to set
     */
    public void setS(double d) {
        struct.put(getNodes()[6], d);
    }

    /**
     * Sets the value of 'T'
     *
     * @param d the value to set
     */
    public void setT(double d) {
        struct.put(getNodes()[7], d);
    }
}
