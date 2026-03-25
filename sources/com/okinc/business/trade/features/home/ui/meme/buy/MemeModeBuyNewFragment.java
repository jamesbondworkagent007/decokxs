package com.okinc.business.trade.features.home.ui.meme.buy;

import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.trade.features.home.ui.meme.buy.MemeModeBuyNewFragment;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22401hef;
import o.AbstractC22421hez;
import o.AbstractC30962lkz;
import o.AbstractC58185ywX;
import o.C22372heC;
import o.C22380heK;
import o.C23274hvD;
import o.C23500hzR;
import o.C25266itV;
import o.C25295ity;
import o.C25444iwo;
import o.C25446iwq;
import o.C30922lkL;
import o.C30943lkg;
import o.C30988llY;
import o.C31125loC;
import o.C31172lox;
import o.C31200lpY;
import o.C55296xhK;
import o.C56390yDp;
import o.C56424yEw;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.kVW;
import o.kXY;
import o.yBK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeBuyNewFragment extends AbstractC30962lkz {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int hDKMBd = 8;

    @yCM
    public C25446iwq handleMemeEventTrackUtils;
    public final TransactionType iwGUEr = TransactionType.Buy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC30827liW
    public TransactionType AkhnZx() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hTH, o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.aCSzUz;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.buy.MemeModeBuyNewFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: newInstance-OT9-yGk$default, reason: not valid java name */
        public static /* synthetic */ MemeModeBuyNewFragment m6638newInstanceOT9yGk$default(ActionBar actionBar, String str, TokenBase tokenBase, String str2, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            if ((i2 & 8) != 0) {
                i = C31172lox.Companion.KWHzl();
            }
            return actionBar.OLrzqt(str, tokenBase, str2, i);
        }

        public final MemeModeBuyNewFragment OLrzqt(@NotNull String str, @NotNull TokenBase tokenBase, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Bundle bundle = new Bundle();
            bundle.putParcelable("transaction_token", tokenBase);
            bundle.putString("transaction_amount", str2);
            C31200lpY.EZpvd(bundle, str);
            C31125loC.copydefault(bundle, i);
            MemeModeBuyNewFragment memeModeBuyNewFragment = new MemeModeBuyNewFragment();
            memeModeBuyNewFragment.setArguments(bundle);
            return memeModeBuyNewFragment;
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

    public final C25446iwq wlaJM() {
        C25446iwq c25446iwq = this.handleMemeEventTrackUtils;
        if (c25446iwq != null) {
            return c25446iwq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C23500hzR c23500hzR, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c23500hzR, "");
        KWHzl(values());
        iwGUEr();
        uzCIH();
        isConnected().AEQbTJ(C31125loC.KWHzl(this));
        AppCompatTextView appCompatTextView = c23500hzR.AEQbTJ;
        appCompatTextView.setOnClickListener(new StateListAnimator(appCompatTextView, 1000L, this));
        RelativeLayout relativeLayout = c23500hzR.KWHzl;
        relativeLayout.setOnClickListener(new Activity(relativeLayout, 1000L, this));
    }

    public static final class TaskDescription implements Function1<MemeCurrencyBean, Unit> {
        public final /* synthetic */ String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(MemeCurrencyBean memeCurrencyBean) {
            EZpvd(memeCurrencyBean);
            return Unit.INSTANCE;
        }

        public final void EZpvd(MemeCurrencyBean memeCurrencyBean) {
            Intrinsics.checkNotNullParameter(memeCurrencyBean, "");
            MemeModeBuyNewFragment.this.OLrzqt(memeCurrencyBean.getCurrencyTokenInfo());
            if (C31172lox.KWHzl(C31125loC.KWHzl(MemeModeBuyNewFragment.this), C31172lox.Companion.OLrzqt())) {
                RxBus.AEQbTJ(new C30922lkL(memeCurrencyBean.getCurrencyTokenInfo(), this.EZpvd));
            }
        }
    }

    public static final class Application implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            MemeModeBuyNewFragment.this.isConnected().OLrzqt().setValue(Integer.valueOf(MemeModeBuyNewFragment.this.AkhnZx().getType()));
        }
    }

    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C22380heK.OLrzqt.copydefault(AuCTel()).EZpvd(true).gEmmrt().AEQbTJ();
        isConnected().KWHzl(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress(), values().getTokenContractAddress());
        kVW.EZpvd.OLrzqt(AuCTel(), AkhnZx(), values(), isConnected().EZpvd(values().getChainId(), values().getTokenContractAddress()), C31125loC.KWHzl(this));
        isConnected().OLrzqt(AuCTel(), dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress());
        EZpvd(new kXY.ActionBar(dexMultiTokenInfoBean.getAmount()));
        isConnected().OLrzqt().setValue(Integer.valueOf(AkhnZx().getType()));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ MemeModeBuyNewFragment OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, MemeModeBuyNewFragment memeModeBuyNewFragment) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = memeModeBuyNewFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C30988llY c30988llYAEQbTJ = C30988llY.Companion.AEQbTJ(this.OLrzqt.AkhnZx().getType(), this.OLrzqt.values().getChainId(), C31172lox.Companion.OLrzqt(), this.OLrzqt.new Application());
                FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c30988llYAEQbTJ.show(childFragmentManager);
                this.OLrzqt.wlaJM().copydefault(new AbstractC22401hef.TaskDescription(this.OLrzqt.values().getChainId(), C25444iwo.AEQbTJ(C31125loC.KWHzl(this.OLrzqt)), C25444iwo.EZpvd(C31125loC.KWHzl(this.OLrzqt)), (this.OLrzqt.AkhnZx() == TransactionType.Buy ? TrackTransactionDirection.BUY : TrackTransactionDirection.SELL).getValue(), AbstractC22421hez.Companion.KWHzl(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.BUTTON_AMT_SETTING.getValue()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt("popup_source", this.OLrzqt.gEmmrt())), null, 64, null));
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ MemeModeBuyNewFragment KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, MemeModeBuyNewFragment memeModeBuyNewFragment) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = memeModeBuyNewFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TransactionType transactionTypeAkhnZx = this.KWHzl.AkhnZx();
                TransactionType transactionType = TransactionType.Buy;
                if (transactionTypeAkhnZx == transactionType && (this.KWHzl.isConnected().EZpvd().getValue() instanceof kXY.ActionBar)) {
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = this.KWHzl.isConnected().EZpvd(this.KWHzl.values().getChainId(), this.KWHzl.values().getTokenContractAddress());
                    String tokenContractAddress = dexMultiTokenInfoBeanEZpvd != null ? dexMultiTokenInfoBeanEZpvd.getTokenContractAddress() : null;
                    String str = tokenContractAddress == null ? "" : tokenContractAddress;
                    C30943lkg c30943lkgCopydefault = C30943lkg.Companion.copydefault(C31125loC.KWHzl(this.KWHzl), this.KWHzl.values().getChainId(), str, this.KWHzl.values().getTokenContractAddress(), this.KWHzl.AkhnZx().getType(), this.KWHzl.new TaskDescription(str));
                    FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c30943lkgCopydefault.show(childFragmentManager);
                }
                this.KWHzl.wlaJM().copydefault(new AbstractC22401hef.TaskDescription(this.KWHzl.values().getChainId(), C25444iwo.AEQbTJ(C31125loC.KWHzl(this.KWHzl)), C25444iwo.EZpvd(C31125loC.KWHzl(this.KWHzl)), (this.KWHzl.AkhnZx() == transactionType ? TrackTransactionDirection.BUY : TrackTransactionDirection.SELL).getValue(), AbstractC22421hez.Companion.KWHzl(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.TOKEN_FROM.getValue()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt("popup_source", this.KWHzl.gEmmrt())), null, 64, null));
            }
        }
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        zLjUOn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        zLjUOn();
    }

    public final void zLjUOn() {
        C25295ity.AEQbTJ(TabTitleInfo.KEY_MEME, "buy", C25295ity.copydefault(C22372heC.EZpvd(AuCTel())), DexTrackEventParameter.AEQbTJ.OLrzqt(AuCTel()));
    }

    @Override // o.AbstractC30827liW, o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl())) {
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C30922lkL.class, new String[0]);
            final Function1 function1 = new Function1() { // from class: o.lkx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeModeBuyNewFragment.KWHzl(this.copydefault, (C30922lkL) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.lky
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MemeModeBuyNewFragment.copydefault(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.lkw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeModeBuyNewFragment.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.lkv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MemeModeBuyNewFragment.AhwBna(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            yBK.EZpvd(interfaceC58217yxCAEQbTJ, EZpvd());
            return;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(C30922lkL.class, new String[0]);
        final Function1 function13 = new Function1() { // from class: o.lkE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeBuyNewFragment.copydefault(this.OLrzqt, (C30922lkL) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.lkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeBuyNewFragment.valueOf(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.lkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeBuyNewFragment.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.lkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeBuyNewFragment.AYXKKw(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ2, EZpvd());
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(MemeModeBuyNewFragment memeModeBuyNewFragment, C30922lkL c30922lkL) {
        if (Intrinsics.EZpvd((Object) c30922lkL.KWHzl().getChainId(), (Object) memeModeBuyNewFragment.values().getChainId()) && !Intrinsics.EZpvd((Object) c30922lkL.KWHzl().getTokenContractAddress(), (Object) memeModeBuyNewFragment.values().getTokenContractAddress())) {
            memeModeBuyNewFragment.OLrzqt(c30922lkL.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(MemeModeBuyNewFragment memeModeBuyNewFragment, C30922lkL c30922lkL) {
        memeModeBuyNewFragment.OLrzqt(c30922lkL.KWHzl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC30827liW, o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RelativeLayout relativeLayout;
        AppCompatTextView appCompatTextView;
        C23500hzR c23500hzR = (C23500hzR) fARcdN();
        if (c23500hzR != null && (appCompatTextView = c23500hzR.AEQbTJ) != null) {
            appCompatTextView.setOnClickListener(null);
        }
        C23500hzR c23500hzR2 = (C23500hzR) fARcdN();
        if (c23500hzR2 != null && (relativeLayout = c23500hzR2.KWHzl) != null) {
            relativeLayout.setOnClickListener(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
