package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.BaseTransferSignData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C9694baS;
import o.fXY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gnq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20808gnq extends C20775gnJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.gnq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gnq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20808gnq KWHzl(android.os.Bundle bundle) {
            C20808gnq c20808gnq = new C20808gnq();
            c20808gnq.setArguments(bundle);
            return c20808gnq;
        }
    }

    @Override // o.C20775gnJ, o.AbstractC20799gnh
    public void gEmmrt() {
        if (KWHzl()) {
            EZpvd(C13754dXa.FragmentManager.setStackedBackgroundDrawable);
        }
    }

    @Override // o.C20775gnJ, o.AbstractC20799gnh
    public void copydefault(@NotNull C20863gos c20863gos) {
        Intrinsics.checkNotNullParameter(c20863gos, "");
        super.copydefault(c20863gos);
        valueOf().AEQbTJ.setVisibility(8);
    }

    @Override // o.C20775gnJ, o.AbstractC20799gnh
    public boolean AYXKKw(boolean z) {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
        if (abstractC8664bGwFJNWhG == null) {
            return false;
        }
        java.lang.String strAuCTel = AhwBna().AuCTel();
        if (!z && C33129mqd.valueOf(strAuCTel, 0) && !((BaseTransferSignData) abstractC8664bGwFJNWhG.QVsKAR()).isTransferMaxAmount()) {
            C20775gnJ.setAmtErrInfo$default(this, false, false, null, false, false, null, 62, null);
            return true;
        }
        if (C33129mqd.valueOf(strAuCTel, 0)) {
            java.lang.String string = getString(C13754dXa.FragmentManager.QsIRgs);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C20775gnJ.setAmtErrInfo$default(this, true, false, string, false, false, null, 56, null);
            return false;
        }
        if (!AhwBna().EZpvd()) {
            C20775gnJ.setAmtErrInfo$default(this, true, false, isConnected(), false, false, null, 56, null);
            return false;
        }
        C20775gnJ.setAmtErrInfo$default(this, false, false, null, false, false, null, 62, null);
        return true;
    }

    @Override // o.C20775gnJ, o.AbstractC20799gnh
    public void AkhnZx() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        if (valueOf().copydefault.fJNWhG() || (abstractC8664bGwFJNWhG = AhwBna().fJNWhG()) == null) {
            return;
        }
        if (!AYXKKw(true)) {
            djBIcL(false);
            return;
        }
        C9694baS.Application application = C9694baS.Companion;
        fXY.Application application2 = fXY.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        application.KWHzl(this, application2.EZpvd(context, abstractC8664bGwFJNWhG, getArguments()), new Function2() { // from class: o.gnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20808gnq.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit EZpvd(C20808gnq c20808gnq, int i, android.content.Intent intent) {
        FragmentActivity activity;
        if (i == -1 && (activity = c20808gnq.getActivity()) != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
        return Unit.INSTANCE;
    }
}
