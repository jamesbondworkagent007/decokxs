package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eAM extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC16335ehw EZpvd;
    public java.lang.String KWHzl = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String copydefault = "";
    public int AhwBna = WalletType.HDWallet.ordinal();

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eAM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eAM.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2);
            intent.putExtra("name", str3);
            intent.putExtra("type", i);
            context.startActivity(intent);
        }
    }

    private final void KWHzl() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.KWHzl = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.AEQbTJ = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("name");
        this.copydefault = stringExtra3 != null ? stringExtra3 : "";
        this.AhwBna = getIntent().getIntExtra("type", WalletType.HDWallet.ordinal());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16335ehw) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.gHZMYf);
        C32866mlf.onEvent$default("Web3WalletManagement_ManagePage_SmartAccount_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        KWHzl();
        copydefault();
    }

    private final void copydefault() {
        AbstractC16335ehw abstractC16335ehw = null;
        if (WalletType.AAWallet == WalletType.Companion.KWHzl(this.AhwBna)) {
            AbstractC16335ehw abstractC16335ehw2 = this.EZpvd;
            if (abstractC16335ehw2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16335ehw2 = null;
            }
            abstractC16335ehw2.AuCTel.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.getRatingType, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("AccountName", this.copydefault))));
        } else {
            AbstractC16335ehw abstractC16335ehw3 = this.EZpvd;
            if (abstractC16335ehw3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16335ehw3 = null;
            }
            abstractC16335ehw3.AuCTel.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.getQueue, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("AccountName", this.copydefault))));
        }
        AbstractC16335ehw abstractC16335ehw4 = this.EZpvd;
        if (abstractC16335ehw4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16335ehw4 = null;
        }
        abstractC16335ehw4.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.eAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eAM.AEQbTJ(this.OLrzqt, view);
            }
        });
        if (this.KWHzl.length() == 0) {
            AbstractC16335ehw abstractC16335ehw5 = this.EZpvd;
            if (abstractC16335ehw5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16335ehw5 = null;
            }
            abstractC16335ehw5.EZpvd.setVisibility(0);
            AbstractC16335ehw abstractC16335ehw6 = this.EZpvd;
            if (abstractC16335ehw6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16335ehw6 = null;
            }
            abstractC16335ehw6.copydefault.setVisibility(8);
            AbstractC16335ehw abstractC16335ehw7 = this.EZpvd;
            if (abstractC16335ehw7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16335ehw = abstractC16335ehw7;
            }
            abstractC16335ehw.DbNXlk.setText(this.AEQbTJ);
            getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eAU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    eAM.EZpvd(this.EZpvd);
                }
            });
            return;
        }
        AbstractC16335ehw abstractC16335ehw8 = this.EZpvd;
        if (abstractC16335ehw8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16335ehw8 = null;
        }
        abstractC16335ehw8.EZpvd.setVisibility(8);
        AbstractC16335ehw abstractC16335ehw9 = this.EZpvd;
        if (abstractC16335ehw9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16335ehw9 = null;
        }
        abstractC16335ehw9.copydefault.setVisibility(0);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.KWHzl, true);
        final Function1 function1 = new Function1() { // from class: o.eAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAM.EZpvd(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eAM.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAM.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eAM.AEQbTJ(function12, obj);
            }
        });
        addDisposable(interfaceC58217yxCAEQbTJ);
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
    }

    public static final void AEQbTJ(eAM eam, android.view.View view) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, eam, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplContextThemeWrapperCompatApi17Impl)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    public static final void EZpvd(eAM eam) {
        rVN.reportFullyDrawn$default((android.app.Activity) eam, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(eAM eam, AbstractC12782ctV abstractC12782ctV) {
        int iDjBIcL;
        float fDp$default;
        if (abstractC12782ctV.getFieldNames()) {
            AbstractC16335ehw abstractC16335ehw = eam.EZpvd;
            if (abstractC16335ehw == null) {
                Intrinsics.gEmmrt("");
                abstractC16335ehw = null;
            }
            abstractC16335ehw.fetchVPNInfo.setVisibility(0);
        } else {
            AbstractC16335ehw abstractC16335ehw2 = eam.EZpvd;
            if (abstractC16335ehw2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16335ehw2 = null;
            }
            abstractC16335ehw2.fetchVPNInfo.setVisibility(8);
        }
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        AbstractC16335ehw abstractC16335ehw3 = eam.EZpvd;
        if (abstractC16335ehw3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16335ehw3 = null;
        }
        android.widget.TextView textView = abstractC16335ehw3.fIwbmz;
        ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, jFetchVPNInfo, null, 2, null);
        textView.setText(chainAddress != null ? chainAddress.getAddress() : null);
        AbstractC16335ehw abstractC16335ehw4 = eam.EZpvd;
        if (abstractC16335ehw4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16335ehw4 = null;
        }
        android.widget.TextView textView2 = abstractC16335ehw4.fARcdN;
        textView2.setText(abstractC12782ctV.AkhnZx());
        if (abstractC12782ctV.getFieldNames()) {
            iDjBIcL = C7857arj.djBIcL(textView2.getContext());
            fDp$default = C55298xhM.dp$default(168.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            iDjBIcL = C7857arj.djBIcL(textView2.getContext());
            fDp$default = C55298xhM.dp$default(128.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        int i = iDjBIcL - ((int) fDp$default);
        if (textView2.getPaint().measureText(abstractC12782ctV.AkhnZx()) > i) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            layoutParams.width = i;
            textView2.setLayoutParams(layoutParams);
        }
        AbstractC16335ehw abstractC16335ehw5 = eam.EZpvd;
        if (abstractC16335ehw5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16335ehw5 = null;
        }
        ShapeableImageView shapeableImageView = abstractC16335ehw5.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        C14725dqq.loadBlockiesIcon$default(shapeableImageView, abstractC12782ctV.AEQbTJ(), C13754dXa.Activity.getNewProxyInstance, null, 48.0f, 4, null);
        rVN.reportFullyDrawn$default((android.app.Activity) eam, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(eAM eam, java.lang.Throwable th) {
        pUU.copydefault(eam.getTAG(), "getWalletById error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
