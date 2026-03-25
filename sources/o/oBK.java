package o;

import android.provider.MediaStore;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.qrcode.IMQRCodeHelper$handleQrAction$1;
import com.okinc.im.qrcode.IMQRCodeHelper$handleQrActionV2$1;
import com.okinc.im.qrcode.IMQRCodeHelper$handleQrActionV2$2;
import com.okinc.im.qrcode.IMQRCodeHelper$resolveIMQRCodeInfo$1;
import com.okinc.im.qrcode.IMQRCodeHelper$resolveIMQRCodeInfo$2$1;
import com.okinc.im.qrcode.IMQRCodeHelper$resolveIMQRCodeInfoV2$1;
import com.okinc.im.qrcode.IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1;
import com.okinc.okimcore.model.exception.OKIMGroupNotExistException;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.QRCodeResultInfo;
import com.okinc.okimcore.model.remote.QRCodeType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.ActivityC35548nxT;
import o.C35399nuc;
import o.nTQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oBK {
    public static final oBK KWHzl = new oBK();

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[QRCodeType.values().length];
            try {
                iArr[QRCodeType.Contact.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[QRCodeType.Group.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private oBK() {
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        oBK obk;
        AbstractActivityC33041mov abstractActivityC33041mov;
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (context instanceof AbstractActivityC33041mov) {
            abstractActivityC33041mov = (AbstractActivityC33041mov) context;
            obk = this;
        } else {
            obk = this;
            abstractActivityC33041mov = null;
        }
        if (obk.KWHzl(str)) {
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.showLoading();
            }
            if (C44157sFk.gEmmrt().AkhnZx()) {
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new IMQRCodeHelper$handleQrAction$1(str, abstractActivityC33041mov, context, null), 3, null);
                return;
            }
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            C55326xho.toast$default(C35399nuc.LoaderManager.RVsVBY, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        C55326xho.toast$default(C35399nuc.LoaderManager.RbMRq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.finish();
        }
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        oBK obk;
        AbstractActivityC33041mov abstractActivityC33041mov;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (context instanceof AbstractActivityC33041mov) {
            abstractActivityC33041mov = (AbstractActivityC33041mov) context;
            obk = this;
        } else {
            obk = this;
            abstractActivityC33041mov = null;
        }
        try {
            if (obk.KWHzl(str)) {
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.showLoading();
                }
                if (C44157sFk.gEmmrt().AkhnZx()) {
                    AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                    if (appCompatActivity == null || (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) == null) {
                        return;
                    }
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope2, null, null, new IMQRCodeHelper$handleQrActionV2$1(str, abstractActivityC33041mov, context, null), 3, null);
                    return;
                }
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.dismissLoading();
                }
                C55326xho.toast$default(C35399nuc.LoaderManager.RVsVBY, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity2)) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new IMQRCodeHelper$handleQrActionV2$2(str, abstractActivityC33041mov, context, null), 3, null);
        } catch (java.lang.Exception unused) {
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.finish();
            }
        }
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return C59449zhJ.gEmmrt(android.net.Uri.parse(str).getQueryParameter(BotWebHook.KEY_ACTION), OtcExtraKeys.IM, true);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super QRCodeResultInfo, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        IMQRCodeHelper$resolveIMQRCodeInfo$1 iMQRCodeHelper$resolveIMQRCodeInfo$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof IMQRCodeHelper$resolveIMQRCodeInfo$1) {
            iMQRCodeHelper$resolveIMQRCodeInfo$1 = (IMQRCodeHelper$resolveIMQRCodeInfo$1) continuation;
            int i = iMQRCodeHelper$resolveIMQRCodeInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iMQRCodeHelper$resolveIMQRCodeInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                iMQRCodeHelper$resolveIMQRCodeInfo$1 = new IMQRCodeHelper$resolveIMQRCodeInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = iMQRCodeHelper$resolveIMQRCodeInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iMQRCodeHelper$resolveIMQRCodeInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                IMQRCodeHelper$resolveIMQRCodeInfo$2$1 iMQRCodeHelper$resolveIMQRCodeInfo$2$1 = new IMQRCodeHelper$resolveIMQRCodeInfo$2$1(interfaceC35180nqU, str, null);
                iMQRCodeHelper$resolveIMQRCodeInfo$1.L$0 = function1;
                iMQRCodeHelper$resolveIMQRCodeInfo$1.L$1 = function12;
                iMQRCodeHelper$resolveIMQRCodeInfo$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, iMQRCodeHelper$resolveIMQRCodeInfo$2$1, iMQRCodeHelper$resolveIMQRCodeInfo$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function12 = (Function1) iMQRCodeHelper$resolveIMQRCodeInfo$1.L$1;
                function1 = (Function1) iMQRCodeHelper$resolveIMQRCodeInfo$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((QRCodeResultInfo) objWithContext);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            function1.invoke((QRCodeResultInfo) objM7377constructorimpl);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            function12.invoke(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, Function1<? super QRCodeResultInfo, Unit> function1, Function1<? super java.lang.Throwable, Unit> function12, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        IMQRCodeHelper$resolveIMQRCodeInfoV2$1 iMQRCodeHelper$resolveIMQRCodeInfoV2$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof IMQRCodeHelper$resolveIMQRCodeInfoV2$1) {
            iMQRCodeHelper$resolveIMQRCodeInfoV2$1 = (IMQRCodeHelper$resolveIMQRCodeInfoV2$1) continuation;
            int i = iMQRCodeHelper$resolveIMQRCodeInfoV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iMQRCodeHelper$resolveIMQRCodeInfoV2$1.label = i - Integer.MIN_VALUE;
            } else {
                iMQRCodeHelper$resolveIMQRCodeInfoV2$1 = new IMQRCodeHelper$resolveIMQRCodeInfoV2$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = iMQRCodeHelper$resolveIMQRCodeInfoV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iMQRCodeHelper$resolveIMQRCodeInfoV2$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1 iMQRCodeHelper$resolveIMQRCodeInfoV2$2$1 = new IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1(interfaceC35180nqU, str, null);
                iMQRCodeHelper$resolveIMQRCodeInfoV2$1.L$0 = function1;
                iMQRCodeHelper$resolveIMQRCodeInfoV2$1.L$1 = function12;
                iMQRCodeHelper$resolveIMQRCodeInfoV2$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, iMQRCodeHelper$resolveIMQRCodeInfoV2$2$1, iMQRCodeHelper$resolveIMQRCodeInfoV2$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function12 = (Function1) iMQRCodeHelper$resolveIMQRCodeInfoV2$1.L$1;
                function1 = (Function1) iMQRCodeHelper$resolveIMQRCodeInfoV2$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((QRCodeResultInfo) objWithContext);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            function1.invoke((QRCodeResultInfo) objM7377constructorimpl);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            function12.invoke(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final android.content.Context context, @NotNull final QRCodeResultInfo qRCodeResultInfo) {
        android.app.Activity activity;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(qRCodeResultInfo, "");
        int i = Activity.EZpvd[qRCodeResultInfo.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                C37683oyU.AEQbTJ(qRCodeResultInfo.getId(), new Function1() { // from class: o.oBL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oBK.EZpvd(context, qRCodeResultInfo, (GroupInfo) obj);
                    }
                }, new Function1() { // from class: o.oBM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oBK.KWHzl(context, (java.lang.Throwable) obj);
                    }
                });
                return;
            }
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (C44157sFk.KWHzl(qRCodeResultInfo.getId())) {
            java.lang.String string = context.getString(C35399nuc.LoaderManager.RbMRq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        } else {
            context.startActivity(ActivityC35548nxT.ActionBar.createIntent$default(ActivityC35548nxT.Companion, context, "qr_code", qRCodeResultInfo.getId(), null, false, 16, null));
        }
        activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }

    public static final Unit EZpvd(android.content.Context context, QRCodeResultInfo qRCodeResultInfo, GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        context.startActivity(nTQ.Application.createIntent$default(nTQ.Companion, context, qRCodeResultInfo.getCreatorId(), null, 4, null));
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.content.Context context, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String strCopydefault = C44157sFk.copydefault(th);
        if (strCopydefault != null) {
            C55326xho.toast$default(strCopydefault, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
        }
        if (th instanceof OKIMGroupNotExistException) {
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull android.app.Activity activity, @NotNull ImageShareParams imageShareParams, oBT obt) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        try {
            java.lang.String str = C34703nhO.OLrzqt(activity) + "_" + java.lang.System.currentTimeMillis();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) imageShareParams.getPendingShareImagePath())) {
                if (obt != null) {
                    obt.KWHzl(new java.lang.IllegalArgumentException("bitmap or imagePath is null!"));
                    return;
                }
                return;
            }
            java.lang.String strInsertImage = MediaStore.Images.Media.insertImage(activity.getContentResolver(), imageShareParams.getPendingShareImagePath(), str, (java.lang.String) null);
            C33610mzh c33610mzh = C33610mzh.OLrzqt;
            android.net.Uri uri = android.net.Uri.parse(strInsertImage);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            activity.sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", android.net.Uri.fromFile(new java.io.File(c33610mzh.EZpvd(activity, uri)))));
            if (obt != null) {
                obt.EZpvd();
            }
        } catch (java.lang.Exception e) {
            if (obt != null) {
                obt.KWHzl(e);
            }
        } catch (java.lang.OutOfMemoryError e2) {
            if (obt != null) {
                obt.KWHzl(e2);
            }
        }
    }
}
