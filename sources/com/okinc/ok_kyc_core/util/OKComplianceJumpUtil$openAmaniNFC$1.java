package com.okinc.ok_kyc_core.util;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.okinc.ok_kyc_core.data.amani.AmaniNFCParams;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.rTM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceJumpUtil$openAmaniNFC$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ rTM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceJumpUtil$openAmaniNFC$1(rTM rtm, Continuation<? super OKComplianceJumpUtil$openAmaniNFC$1> continuation) {
        super(continuation);
        this.this$0 = rtm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((Context) null, (AmaniNFCParams) null, (ActivityResultLauncher<Intent>) null, this);
    }
}
