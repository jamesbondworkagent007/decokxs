package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MessageSignData extends BaseSignData {
    public static final int $stable = 8;
    private String data;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.business.defi.api.model.tx.signdata.MessageSignData.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MessageSignData(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
    }

    private MessageSignData(String str) {
        super(null);
        this.data = str;
    }
}
