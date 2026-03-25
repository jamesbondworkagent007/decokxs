package o;

import android.view.View;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lmm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31055lmm extends AbstractC31054lml {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final TransactionType getFieldNames = TransactionType.Sell;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC30827liW
    public TransactionType AkhnZx() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hTH, o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.DBxZfM;
    }

    /* JADX INFO: renamed from: o.lmm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lmm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: newInstance-OT9-yGk$default, reason: not valid java name */
        public static /* synthetic */ C31055lmm m8683newInstanceOT9yGk$default(StateListAnimator stateListAnimator, java.lang.String str, TokenBase tokenBase, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            if ((i2 & 8) != 0) {
                i = C31172lox.Companion.KWHzl();
            }
            return stateListAnimator.AEQbTJ(str, tokenBase, str2, i);
        }

        public final C31055lmm AEQbTJ(@NotNull java.lang.String str, @NotNull TokenBase tokenBase, @NotNull java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("transaction_token", tokenBase);
            bundle.putString("transaction_amount", str2);
            C31125loC.copydefault(bundle, i);
            C31055lmm c31055lmm = new C31055lmm();
            c31055lmm.setArguments(bundle);
            return c31055lmm;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC30827liW
    public C25266itV fJNWhG() {
        C23500hzR c23500hzR = (C23500hzR) fARcdN();
        if (c23500hzR != null) {
            return c23500hzR.djBIcL;
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C23500hzR c23500hzR, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c23500hzR, "");
        KWHzl(values());
        uzCIH();
        android.widget.RelativeLayout relativeLayout = c23500hzR.KWHzl;
        relativeLayout.setOnClickListener(new TaskDescription(relativeLayout, 1000L, this));
    }

    /* JADX INFO: renamed from: o.lmm$Activity */
    public static final class Activity implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C31055lmm.this.isConnected().OLrzqt().setValue(java.lang.Integer.valueOf(C31055lmm.this.AkhnZx().getType()));
        }
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        wlaJM();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        wlaJM();
    }

    private final void wlaJM() {
        C25295ity.AEQbTJ(TabTitleInfo.KEY_MEME, "sell", C25295ity.copydefault(C22372heC.EZpvd(AuCTel())), DexTrackEventParameter.AEQbTJ.OLrzqt(AuCTel()));
    }

    /* JADX INFO: renamed from: o.lmm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C31055lmm KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C31055lmm c31055lmm) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c31055lmm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C30988llY c30988llYAEQbTJ = C30988llY.Companion.AEQbTJ(this.KWHzl.AkhnZx().getType(), this.KWHzl.values().getChainId(), C31172lox.Companion.OLrzqt(), this.KWHzl.new Activity());
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c30988llYAEQbTJ.show(childFragmentManager);
            }
        }
    }
}
