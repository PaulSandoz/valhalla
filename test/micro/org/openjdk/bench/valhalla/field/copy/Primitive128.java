/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.bench.valhalla.field.copy;

import org.openjdk.bench.valhalla.field.util.PrimitiveStates;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.CompilerControl;

public class Primitive128 extends PrimitiveStates {

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void p128int_copy(Primitive128int s, Primitive128int d) {
        P128int[] src = s.arr;
        P128int[] dst = d.arr;
        for(int i=0; i<src.length; i++) {
            dst[i].f0 = src[i].f0;
            dst[i].f1 = src[i].f1;
            dst[i].f2 = src[i].f2;
            dst[i].f3 = src[i].f3;
        }
    }


}
