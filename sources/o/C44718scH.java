package o;

import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.ModuleType;
import com.okinc.biz.model.SupportService;
import com.okinc.biz.model.VideoQueueResult;
import com.okinc.biz.model.VipManagerInfo;
import com.okinc.okex.OnlineServiceWalletImpl$buildRatingPageIntent$1;
import com.okinc.okex.OnlineServiceWalletImpl$getRatingMetadata$1;
import com.okinc.okex.OnlineServiceWalletImpl$startChatBot$1;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.ui.SupportIntegratedSolutionSimpleActivity;
import com.okinc.okex.center.ui.fragment.SupportHomeRecommendCardSimpleFragment;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.ActivityC45200slM;
import o.ActivityC45850szP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44718scH extends AbstractC43215rlA implements InterfaceC6804aWL {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = (C45354soH.copydefault | C45348soB.AEQbTJ) | syS.OLrzqt;
    public final syS KWHzl;
    public final C45348soB OLrzqt;
    public final C45354soH copydefault;

    @Override // o.InterfaceC6804aWL
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super VipManagerInfo> continuation) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC6804aWL
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC6804aWL
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, int i, Function2<? super java.lang.Boolean, ? super java.lang.Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC6804aWL
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, java.lang.String str2, Function1<? super VideoQueueResult, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @yCM
    public C44718scH(@NotNull syS sys, @NotNull C45348soB c45348soB, @NotNull C45354soH c45354soH) {
        Intrinsics.checkNotNullParameter(sys, "");
        Intrinsics.checkNotNullParameter(c45348soB, "");
        Intrinsics.checkNotNullParameter(c45354soH, "");
        this.KWHzl = sys;
        this.OLrzqt = c45348soB;
        this.copydefault = c45354soH;
    }

    /* JADX INFO: renamed from: o.scH$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.scH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC6804aWL
    public java.lang.Object AEQbTJ(@NotNull C6811aWS c6811aWS, @NotNull Continuation<? super SupportService> continuation) {
        return this.copydefault.KWHzl(c6811aWS, continuation);
    }

    @Override // o.InterfaceC6804aWL
    public void OLrzqt(@NotNull android.content.Context context, C6807aWO c6807aWO) {
        Intrinsics.checkNotNullParameter(context, "");
        C44906sfk.OLrzqt.KWHzl();
        ContextCompat.startActivity(context, EZpvd(context, c6807aWO), null);
    }

    @Override // o.InterfaceC6804aWL
    public android.content.Intent EZpvd(@NotNull android.content.Context context, C6807aWO c6807aWO) {
        Intrinsics.checkNotNullParameter(context, "");
        return ActivityC44873sfD.Companion.EZpvd(context, c6807aWO, true);
    }

    @Override // o.InterfaceC6804aWL
    public android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return SupportIntegratedSolutionSimpleActivity.Companion.EZpvd(context, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : str, IntegratedSolutionPageType.MiniSupport);
    }

    @Override // o.InterfaceC6804aWL
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (bundle == null) {
            bundle = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str));
        } else {
            bundle.putString("url", str);
        }
        ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, bundle, null, 4, null);
    }

    @Override // o.InterfaceC6804aWL
    public void copydefault(@NotNull android.content.Context context, @NotNull ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        C45357soK.KWHzl.copydefault(context, new OnlineServiceWalletImpl$startChatBot$1(chatBotRequest, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C6802aWJ c6802aWJ, @NotNull Continuation<? super C6808aWP> continuation) throws java.lang.Throwable {
        OnlineServiceWalletImpl$getRatingMetadata$1 onlineServiceWalletImpl$getRatingMetadata$1;
        if (continuation instanceof OnlineServiceWalletImpl$getRatingMetadata$1) {
            onlineServiceWalletImpl$getRatingMetadata$1 = (OnlineServiceWalletImpl$getRatingMetadata$1) continuation;
            int i = onlineServiceWalletImpl$getRatingMetadata$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onlineServiceWalletImpl$getRatingMetadata$1.label = i - Integer.MIN_VALUE;
            } else {
                onlineServiceWalletImpl$getRatingMetadata$1 = new OnlineServiceWalletImpl$getRatingMetadata$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = onlineServiceWalletImpl$getRatingMetadata$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onlineServiceWalletImpl$getRatingMetadata$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            syS sys = this.KWHzl;
            ModuleType moduleTypeKWHzl = c6802aWJ.KWHzl();
            java.lang.String strEZpvd = c6802aWJ.EZpvd();
            onlineServiceWalletImpl$getRatingMetadata$1.label = 1;
            objEZpvd = sys.EZpvd(moduleTypeKWHzl, strEZpvd, onlineServiceWalletImpl$getRatingMetadata$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return (C6808aWP) objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC6804aWL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull C6803aWK c6803aWK, @NotNull Continuation<? super Result<? extends android.content.Intent>> continuation) {
        OnlineServiceWalletImpl$buildRatingPageIntent$1 onlineServiceWalletImpl$buildRatingPageIntent$1;
        if (continuation instanceof OnlineServiceWalletImpl$buildRatingPageIntent$1) {
            onlineServiceWalletImpl$buildRatingPageIntent$1 = (OnlineServiceWalletImpl$buildRatingPageIntent$1) continuation;
            int i = onlineServiceWalletImpl$buildRatingPageIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onlineServiceWalletImpl$buildRatingPageIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                onlineServiceWalletImpl$buildRatingPageIntent$1 = new OnlineServiceWalletImpl$buildRatingPageIntent$1(this, continuation);
            }
        }
        OnlineServiceWalletImpl$buildRatingPageIntent$1 onlineServiceWalletImpl$buildRatingPageIntent$12 = onlineServiceWalletImpl$buildRatingPageIntent$1;
        java.lang.Object objOLrzqt = onlineServiceWalletImpl$buildRatingPageIntent$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onlineServiceWalletImpl$buildRatingPageIntent$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            syS sys = this.KWHzl;
            ModuleType moduleTypeKWHzl = c6803aWK.KWHzl();
            java.lang.String strCopydefault = c6803aWK.copydefault();
            java.lang.String strEZpvd = c6803aWK.EZpvd();
            JsonObject jsonObjectOLrzqt = c6803aWK.OLrzqt();
            onlineServiceWalletImpl$buildRatingPageIntent$12.L$0 = context;
            onlineServiceWalletImpl$buildRatingPageIntent$12.label = 1;
            objOLrzqt = sys.OLrzqt(moduleTypeKWHzl, strCopydefault, strEZpvd, jsonObjectOLrzqt, onlineServiceWalletImpl$buildRatingPageIntent$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (android.content.Context) onlineServiceWalletImpl$buildRatingPageIntent$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        android.content.Context context2 = context;
        RatingResult ratingResult = (RatingResult) objOLrzqt;
        if (!(ratingResult instanceof RatingResult.Failure)) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(ratingResult != null ? RatingResult.toIntent$default(ratingResult, context2, null, null, 6, null) : null);
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(((RatingResult.Failure) ratingResult).EZpvd()));
    }

    @Override // o.InterfaceC6804aWL
    public java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle, java.lang.Integer num, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOpenPage$default = ActivityC45200slM.Application.openPage$default(ActivityC45200slM.Companion, context, bundle, null, continuation, 4, null);
        return objOpenPage$default == C56442yFn.copydefault() ? objOpenPage$default : Unit.INSTANCE;
    }

    @Override // o.InterfaceC6804aWL
    public android.content.Intent OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new android.content.Intent(context, (java.lang.Class<?>) SupportIntegratedSolutionSimpleActivity.class);
    }

    @Override // o.InterfaceC6804aWL
    public androidx.fragment.app.Fragment EZpvd() {
        return SupportHomeRecommendCardSimpleFragment.Companion.AEQbTJ();
    }

    @Override // o.InterfaceC6804aWL
    public android.content.Intent KWHzl(@NotNull android.content.Context context, C6807aWO c6807aWO) {
        Intrinsics.checkNotNullParameter(context, "");
        return ActivityC44873sfD.Companion.EZpvd(context, c6807aWO, true);
    }

    @Override // o.InterfaceC6804aWL
    public boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C44906sfk.OLrzqt.AEQbTJ(str);
    }
}
