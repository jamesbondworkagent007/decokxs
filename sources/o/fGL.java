package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.wallet.mpc.MpcPrivateKeyItem;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fGL extends AbstractActivityC33013moT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AbstractC16397ejE AEQbTJ;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fGL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.ArrayList<MpcPrivateKeyItem> arrayList) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fGL.class);
            intent.putParcelableArrayListExtra("privateKeyList", arrayList);
            intent.putExtra("mpcid", str);
            intent.putExtra("uid", str2);
            intent.putExtra("rootWalletId", str3);
            intent.putExtra("addressIndex", str4);
            context.startActivity(intent);
        }
    }

    public final java.util.ArrayList<MpcPrivateKeyItem> copydefault() {
        java.util.ArrayList<MpcPrivateKeyItem> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("privateKeyList");
        return parcelableArrayListExtra == null ? new java.util.ArrayList<>() : parcelableArrayListExtra;
    }

    public final java.lang.String KWHzl() {
        java.lang.String stringExtra = getIntent().getStringExtra("addressIndex");
        return stringExtra == null ? "0" : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String OLrzqt() {
        java.lang.String stringExtra = getIntent().getStringExtra("rootWalletId");
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = (AbstractC16397ejE) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.aUsmxb);
        AYXKKw();
        EZpvd();
        gEmmrt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fGL.AYXKKw(this.AEQbTJ);
            }
        });
    }

    public static final void AYXKKw(fGL fgl) {
        rVN.reportFullyDrawn$default((android.app.Activity) fgl, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AYXKKw() {
        AbstractC16397ejE abstractC16397ejE = this.AEQbTJ;
        if (abstractC16397ejE == null) {
            Intrinsics.gEmmrt("");
            abstractC16397ejE = null;
        }
        abstractC16397ejE.AEQbTJ.initView();
    }

    private final void EZpvd() {
        AbstractC16397ejE abstractC16397ejE = this.AEQbTJ;
        AbstractC16397ejE abstractC16397ejE2 = null;
        if (abstractC16397ejE == null) {
            Intrinsics.gEmmrt("");
            abstractC16397ejE = null;
        }
        abstractC16397ejE.AEQbTJ.showLoading();
        java.util.ArrayList<MpcPrivateKeyItem> arrayListCopydefault = copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
        for (MpcPrivateKeyItem mpcPrivateKeyItem : arrayListCopydefault) {
            long chainId = mpcPrivateKeyItem.getChainId();
            java.lang.String privateKey = mpcPrivateKeyItem.getPrivateKey();
            java.lang.String address = mpcPrivateKeyItem.getAddress();
            boolean privateKeyContainerIsOpen = mpcPrivateKeyItem.getPrivateKeyContainerIsOpen();
            boolean privateKeyIsEye = mpcPrivateKeyItem.getPrivateKeyIsEye();
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(mpcPrivateKeyItem.getChainId());
            java.lang.String strDjBIcL = c10854bwMCopydefault != null ? c10854bwMCopydefault.djBIcL() : null;
            java.lang.String chainName = mpcPrivateKeyItem.getChainName();
            if (strDjBIcL != null && strDjBIcL.length() != 0) {
                chainName = strDjBIcL;
            }
            arrayList.add(new com.okinc.web3.security.features.mpc.MpcPrivateKeyItem(chainId, privateKey, address, privateKeyContainerIsOpen, privateKeyIsEye, chainName, mpcPrivateKeyItem.getImageUrl()));
        }
        AbstractC16397ejE abstractC16397ejE3 = this.AEQbTJ;
        if (abstractC16397ejE3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16397ejE2 = abstractC16397ejE3;
        }
        abstractC16397ejE2.AEQbTJ.showPrivateKeyList(arrayList);
    }

    private final void gEmmrt() {
        AbstractC16397ejE abstractC16397ejE = this.AEQbTJ;
        if (abstractC16397ejE == null) {
            Intrinsics.gEmmrt("");
            abstractC16397ejE = null;
        }
        C52794wYp c52794wYp = abstractC16397ejE.EZpvd;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements Function1<java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        public final void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C12779ctS c12779ctS = C12779ctS.KWHzl;
            androidx.fragment.app.FragmentManager supportFragmentManager = fGL.this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            final fGL fgl = fGL.this;
            c12779ctS.AEQbTJ(supportFragmentManager, new Function0<Unit>() { // from class: o.fGL.Activity.4
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    EZpvd();
                    return Unit.INSTANCE;
                }

                public final void EZpvd() {
                    AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(fgl.OLrzqt());
                    final fGL fgl2 = fgl;
                    AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtDjBIcL.OLrzqt(new InterfaceC58229yxO(new Function1<AbstractC12784ctX, InterfaceC58261yxu<? extends java.lang.Integer>>() { // from class: o.fGL.Activity.4.1
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                        public final InterfaceC58261yxu<? extends java.lang.Integer> invoke(AbstractC12784ctX abstractC12784ctX) throws WalletImportError {
                            java.util.List<java.lang.String> copiedEscapeList;
                            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
                            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
                            java.util.List listFJNWhG = (mpcWalletEncodeInfoIsConnected == null || (copiedEscapeList = mpcWalletEncodeInfoIsConnected.getCopiedEscapeList()) == null) ? null : CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) copiedEscapeList);
                            if (listFJNWhG != null && !listFJNWhG.contains(fgl2.KWHzl())) {
                                if (listFJNWhG != null) {
                                    listFJNWhG.add(fgl2.KWHzl());
                                }
                                Objects.toString(listFJNWhG);
                                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(abstractC12784ctX.KWHzl());
                                if (abstractC12782ctV == null) {
                                    throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, "复制私钥 Account 01  不存在", 0, 2, null);
                                }
                                return AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, null, null, null, null, null, listFJNWhG, 63, null);
                            }
                            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
                            Intrinsics.copydefault(abstractC58260yxtCopydefault);
                            return abstractC58260yxtCopydefault;
                        }
                    }) { // from class: o.fGL.ActionBar
                        public final /* synthetic */ Function1 KWHzl;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.KWHzl = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                            return this.KWHzl.invoke(obj);
                        }
                    });
                    final fGL fgl3 = fgl;
                    abstractC58260yxtOLrzqt.AEQbTJ(new InterfaceC58227yxM(new Function1<java.lang.Integer, Unit>() { // from class: o.fGL.Activity.4.5
                        public final void OLrzqt(java.lang.Integer num) {
                            fgl3.AEQbTJ();
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(java.lang.Integer num) {
                            OLrzqt(num);
                            return Unit.INSTANCE;
                        }
                    }) { // from class: o.fGL.StateListAnimator
                        public final /* synthetic */ Function1 copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.copydefault = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.copydefault.invoke(obj);
                        }
                    }, new InterfaceC58227yxM(new Function1<java.lang.Throwable, Unit>() { // from class: o.fGL.Activity.4.3
                        public final void OLrzqt(java.lang.Throwable th) {
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
                            OLrzqt(th);
                            return Unit.INSTANCE;
                        }
                    }) { // from class: o.fGL.StateListAnimator
                        public final /* synthetic */ Function1 copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.copydefault = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.copydefault.invoke(obj);
                        }
                    });
                }
            });
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ() {
        AbstractC16397ejE abstractC16397ejE = this.AEQbTJ;
        if (abstractC16397ejE == null) {
            Intrinsics.gEmmrt("");
            abstractC16397ejE = null;
        }
        abstractC16397ejE.AEQbTJ.copyAllPrivateKey(new Function0() { // from class: o.fGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fGL.djBIcL(this.EZpvd);
            }
        });
    }

    public static final Unit djBIcL(final fGL fgl) {
        C12779ctS c12779ctS = C12779ctS.KWHzl;
        androidx.fragment.app.FragmentManager supportFragmentManager = fgl.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c12779ctS.copydefault(supportFragmentManager, new Function1() { // from class: o.fGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGL.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(fGL fgl, final java.lang.String str) {
        C32866mlf.onEvent$default("Web3MPC_Card_EmergencyExit_Click", (TrackChannel[]) null, new Function1() { // from class: o.fGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGL.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        fgl.finish();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.REASON, str == null ? "" : str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "button_state", "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ fGL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fGL fgl) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = fgl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                new C14461dlr(supportFragmentManager, "mpcCopyAllKey", this.copydefault.new Activity(), null, null, false, 48, null).EZpvd();
            }
        }
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
