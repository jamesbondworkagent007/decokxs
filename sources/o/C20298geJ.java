package o;

import androidx.camera.video.AudioStats;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20298geJ extends C20446ggz<C9191bQt> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.geJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.geJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20298geJ OLrzqt(android.os.Bundle bundle) {
            C20298geJ c20298geJ = new C20298geJ();
            c20298geJ.setArguments(bundle);
            return c20298geJ;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz, o.AbstractC20080gaD
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        if (((C9191bQt) ejfBZ()).UlJrfe().copydefault(C56524yIo.AEQbTJ(C9750bbV.class))) {
            OLrzqt();
        } else {
            super.KWHzl(abstractC8426bCW, c8486bDd);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz, o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (abstractC9832bcy == null) {
            super.copydefault(collection);
            return;
        }
        if ((!abstractC9832bcy.EZpvd() || (abstractC9832bcy instanceof C9808bca) || (abstractC9832bcy instanceof C9754bbZ)) && C33129mqd.AEQbTJ(AbstractC8704bHj.getTransferAmount$default((AbstractC8704bHj) ejfBZ(), false, false, 3, null)) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.QsIRgs), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9750bbV) {
            OLrzqt();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatActivity), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        } else if (abstractC9832bcy instanceof C9751bbW) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnItemSelectedListener), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        } else {
            super.copydefault(collection);
        }
    }
}
