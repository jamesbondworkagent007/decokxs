package com.okinc.components.security.scanner.utils;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C32793mkL;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class StringPool$Companion$readStrings$parseFn$2 extends FunctionReferenceImpl implements Function2<byte[], Integer, String> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StringPool$Companion$readStrings$parseFn$2(Object obj) {
        super(2, obj, C32793mkL.ActionBar.class, "parseUtf16String", "parseUtf16String([BI)Ljava/lang/String;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ String invoke(byte[] bArr, Integer num) {
        return invoke(bArr, num.intValue());
    }

    public final String invoke(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return ((C32793mkL.ActionBar) this.receiver).AEQbTJ(bArr, i);
    }
}
