package com.okinc.ok_kyc_core.presentation.views.accountMerge;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.messaging.Constants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C43662rtX;
import o.C43693ruB;
import o.C55008xbo;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.ViewOnClickListenerC54939xaY;
import o.rTU;

/* JADX INFO: loaded from: classes10.dex */
public final class PopUpManger$showPdfDialog$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $clickCallback;
    final /* synthetic */ Context $context;
    final /* synthetic */ ViewOnClickListenerC54939xaY $dialog;
    final /* synthetic */ Ref.ObjectRef<String> $oldPass;
    final /* synthetic */ String $outPath;
    final /* synthetic */ String $pass;
    final /* synthetic */ C55008xbo $passView;
    final /* synthetic */ Uri $pdfUri;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopUpManger$showPdfDialog$4$1(Context context, Uri uri, String str, String str2, Ref.ObjectRef<String> objectRef, Function0<Unit> function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C55008xbo c55008xbo, Continuation<? super PopUpManger$showPdfDialog$4$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$pdfUri = uri;
        this.$outPath = str;
        this.$pass = str2;
        this.$oldPass = objectRef;
        this.$clickCallback = function0;
        this.$dialog = viewOnClickListenerC54939xaY;
        this.$passView = c55008xbo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PopUpManger$showPdfDialog$4$1(this.$context, this.$pdfUri, this.$outPath, this.$pass, this.$oldPass, this.$clickCallback, this.$dialog, this.$passView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PopUpManger$showPdfDialog$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean bool;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str = "";
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
            if (rtu == null) {
                bool = null;
                Pair[] pairArr = new Pair[2];
                if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
                    str = "success";
                } else if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(false))) {
                    str = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                }
                pairArr[0] = C56390yDp.OLrzqt("status", str);
                pairArr[1] = C56390yDp.OLrzqt("passChange", (C33129mqd.OLrzqt((CharSequence) this.$oldPass.element) || Intrinsics.EZpvd((Object) this.$oldPass.element, (Object) this.$pass)) ? "no" : "yes");
                C43693ruB.copydefault("KYC_Decrypt_Pdf_Status", C56424yEw.AYXKKw(pairArr));
                this.$oldPass.element = this.$pass;
                if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
                    this.$clickCallback.invoke();
                    this.$dialog.dismiss();
                } else {
                    this.$passView.setErrorText(C33070mpX.AYXKKw(C43662rtX.Dialog.QbewEr));
                }
                return Unit.INSTANCE;
            }
            Context context = this.$context;
            Uri uri = this.$pdfUri;
            String str2 = this.$outPath;
            String str3 = this.$pass;
            String str4 = str3 == null ? "" : str3;
            this.label = 1;
            obj = rtu.OLrzqt(context, uri, str2, str4, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        bool = (Boolean) obj;
        Pair[] pairArr2 = new Pair[2];
        if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
        }
        pairArr2[0] = C56390yDp.OLrzqt("status", str);
        pairArr2[1] = C56390yDp.OLrzqt("passChange", (C33129mqd.OLrzqt((CharSequence) this.$oldPass.element) || Intrinsics.EZpvd((Object) this.$oldPass.element, (Object) this.$pass)) ? "no" : "yes");
        C43693ruB.copydefault("KYC_Decrypt_Pdf_Status", C56424yEw.AYXKKw(pairArr2));
        this.$oldPass.element = this.$pass;
        if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
        }
        return Unit.INSTANCE;
    }
}
