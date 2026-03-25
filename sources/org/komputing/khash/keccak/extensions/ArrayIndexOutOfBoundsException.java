package org.komputing.khash.keccak.extensions;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class ArrayIndexOutOfBoundsException extends Throwable {
    public ArrayIndexOutOfBoundsException(int i) {
        super(Intrinsics.KWHzl("Array index out of range: ", Integer.valueOf(i)));
    }
}
