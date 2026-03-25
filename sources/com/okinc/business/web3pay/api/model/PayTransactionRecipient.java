package com.okinc.business.web3pay.api.model;

import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PayTransactionRecipient implements Parcelable {
    public final String KWHzl;
    public final String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: com.okinc.business.web3pay.api.model.PayTransactionRecipient.<init>(java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PayTransactionRecipient(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public PayTransactionRecipient(String str, String str2) {
        this.KWHzl = str;
        this.copydefault = str2;
    }
}
