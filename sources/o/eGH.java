package o;

import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignAccountInfo;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignResult;
import com.okinc.wallet.hardware.api.keystone.KeystoneTokenInfo;
import com.okinc.wallet.hardware.api.keystone.RSV;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eGH extends eGJ {
    public java.lang.String AYXKKw;
    public AbstractC12782ctV AhwBna;
    public C10854bwM EZpvd;
    public C10854bwM KWHzl;
    public java.lang.String OLrzqt;
    public InterfaceC58217yxC copydefault;
    public java.lang.String djBIcL;
    public KeystoneEvmSignType gEmmrt;
    public java.lang.String valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KeystoneEvmSignType.values().length];
            try {
                iArr[KeystoneEvmSignType.Legacy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KeystoneEvmSignType.EIP1559.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KeystoneEvmSignType.PersonalMessage.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[KeystoneEvmSignType.TypeMessage.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public static final class Application {

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SignType.values().length];
                try {
                    iArr[SignType.TYPED_MESSAGE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eGH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j, long j2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.Integer num, SignType signType) {
            java.lang.Integer numValueOf;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eGH.class);
            intent.putExtra("walletId", str);
            intent.putExtra("walletAddress", str2);
            intent.putExtra("chainCoinId", j);
            intent.putExtra("coinId", j2);
            intent.putExtra("evmSignChainId", str4);
            if (num != null) {
                numValueOf = java.lang.Integer.valueOf(eGH.Companion.EZpvd(num.intValue()).getValue());
            } else {
                numValueOf = signType != null ? java.lang.Integer.valueOf(eGH.Companion.KWHzl(signType).getValue()) : null;
            }
            intent.putExtra("evmSignType", numValueOf);
            intent.putExtra("unsignedData", str3);
            return intent;
        }

        public final KeystoneEvmSignType EZpvd(int i) {
            if (i == 0) {
                return KeystoneEvmSignType.Legacy;
            }
            if (i == 2) {
                return KeystoneEvmSignType.EIP1559;
            }
            return KeystoneEvmSignType.Legacy;
        }

        public final KeystoneEvmSignType KWHzl(SignType signType) {
            if (StateListAnimator.AEQbTJ[signType.ordinal()] == 1) {
                return KeystoneEvmSignType.TypeMessage;
            }
            return KeystoneEvmSignType.PersonalMessage;
        }
    }

    @Override // o.eGJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
        } else {
            copydefault();
        }
    }

    public final void copydefault() {
        this.AYXKKw = getIntent().getStringExtra("walletId");
        this.djBIcL = getIntent().getStringExtra("walletAddress");
        C10954byG c10954byG = C10954byG.EZpvd;
        this.EZpvd = c10954byG.valueOf().KWHzl(EZpvd());
        this.OLrzqt = getIntent().getStringExtra("evmSignChainId");
        this.gEmmrt = KeystoneEvmSignType.Companion.EZpvd(getIntent().getIntExtra("evmSignType", KeystoneEvmSignType.Legacy.getValue()));
        this.valueOf = getIntent().getStringExtra("unsignedData");
        this.KWHzl = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(getIntent().getLongExtra("coinId", 0L)));
    }

    public final KeystoneSignAccountInfo OLrzqt(AbstractC12782ctV abstractC12782ctV) throws java.lang.Exception {
        java.lang.String derivePath;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.String strCopydefault;
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C10854bwM c10854bwM = this.EZpvd;
        if (c10854bwM != null) {
            long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
            java.lang.String str = this.djBIcL;
            ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, str != null ? str : "", null, 2, null);
            if (chainAddressAddressFromAddress$default == null || (derivePath = chainAddressAddressFromAddress$default.getDerivePath()) == null) {
                throw new java.lang.Exception("no wallet address");
            }
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ != null && (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) != null && (strCopydefault = c13854daTFetchVPNInfo.copydefault()) != null) {
                return new KeystoneSignAccountInfo(string, jFetchVPNInfo, derivePath, strCopydefault, (java.lang.String) null, (KeystoneEvmSignType) null, (KeystoneTokenInfo) null, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null);
            }
            throw new java.lang.Exception("no hardware id");
        }
        throw new java.lang.Exception("no chainId");
    }

    public final KeystoneSignAccountInfo EZpvd(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) throws java.lang.Exception {
        java.lang.String derivePath;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.String strCopydefault;
        KeystoneEvmSignType keystoneEvmSignType;
        C10854bwM c10854bwMKWHzl;
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C10854bwM c10854bwM2 = this.EZpvd;
        if (c10854bwM2 != null) {
            long jFetchVPNInfo = c10854bwM2.fetchVPNInfo();
            java.lang.String str = this.djBIcL;
            ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, str != null ? str : "", null, 2, null);
            if (chainAddressAddressFromAddress$default == null || (derivePath = chainAddressAddressFromAddress$default.getDerivePath()) == null) {
                throw new java.lang.Exception("no wallet address");
            }
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null || (strCopydefault = c13854daTFetchVPNInfo.copydefault()) == null) {
                throw new java.lang.Exception("no hardware id");
            }
            java.lang.Boolean boolValueOf = c10854bwM != null ? java.lang.Boolean.valueOf(c10854bwM.AxsJAYaxsJAY()) : null;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String str2 = Intrinsics.EZpvd(boolValueOf, bool) ? this.valueOf : null;
            if (Intrinsics.EZpvd(c10854bwM != null ? java.lang.Boolean.valueOf(c10854bwM.ejfBZ()) : null, bool)) {
                KeystoneEvmSignType keystoneEvmSignType2 = this.gEmmrt;
                if (keystoneEvmSignType2 == null) {
                    throw new java.lang.Exception("no sign type");
                }
                keystoneEvmSignType = keystoneEvmSignType2;
            } else {
                keystoneEvmSignType = null;
            }
            return new KeystoneSignAccountInfo(string, jFetchVPNInfo, derivePath, strCopydefault, str2, keystoneEvmSignType, (Intrinsics.EZpvd((c10854bwM == null || (c10854bwMKWHzl = c10854bwM.KWHzl()) == null) ? null : java.lang.Boolean.valueOf(c10854bwMKWHzl.run()), bool) && c10854bwM.DCUTEIddSDPG()) ? new KeystoneTokenInfo(c10854bwM.values(), c10854bwM.fJNWhG(), c10854bwM.valueOf()) : null);
        }
        throw new java.lang.Exception("no chainId");
    }

    /* JADX DEBUG: Possible override for method o.eGJ.OLrzqt()I */
    public final void OLrzqt() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault;
        AbstractC12782ctV abstractC12782ctV = this.AhwBna;
        if (abstractC12782ctV == null) {
            C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
            java.lang.String str = this.AYXKKw;
            if (str == null) {
                str = "";
            }
            abstractC58260yxtCopydefault = instance$default.OLrzqt(str, false);
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(abstractC12782ctV);
        }
        final StateListAnimator stateListAnimator = new StateListAnimator();
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.eGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eGH.KWHzl(stateListAnimator, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.eGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eGH.copydefault(this.copydefault, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eGK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eGH.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eGH.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.copydefault = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eGL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eGH.AhwBna(function12, obj);
            }
        });
    }

    public static final class StateListAnimator implements Function1<?, InterfaceC60096zvd<? extends java.lang.String>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends java.lang.String> invoke(AbstractC12782ctV abstractC12782ctV) throws java.lang.Exception {
            C10854bwM c10854bwM;
            C10854bwM c10854bwM2;
            C10854bwM c10854bwM3;
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            eGH.this.AhwBna = abstractC12782ctV;
            C10854bwM c10854bwM4 = eGH.this.EZpvd;
            if (c10854bwM4 == null || !c10854bwM4.ejfBZ()) {
                C10854bwM c10854bwM5 = eGH.this.EZpvd;
                if (c10854bwM5 == null || !c10854bwM5.AxsJAYaxsJAY()) {
                    C10854bwM c10854bwM6 = eGH.this.EZpvd;
                    if ((c10854bwM6 != null && c10854bwM6.DLWbHP()) || (((c10854bwM = eGH.this.EZpvd) != null && c10854bwM.OqFWZa()) || (((c10854bwM2 = eGH.this.EZpvd) != null && c10854bwM2.flVtFt()) || ((c10854bwM3 = eGH.this.EZpvd) != null && c10854bwM3.run())))) {
                        xZX xzx = xZX.OLrzqt;
                        eGH egh = eGH.this;
                        KeystoneSignAccountInfo keystoneSignAccountInfoEZpvd = egh.EZpvd(abstractC12782ctV, egh.KWHzl);
                        java.lang.String str = eGH.this.valueOf;
                        if (str != null) {
                            return xzx.EZpvd(keystoneSignAccountInfoEZpvd, str);
                        }
                        throw new java.lang.Exception("no unsignedData");
                    }
                    AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
                    Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
                    return abstractC58185ywXKWHzl;
                }
                xZX xzx2 = xZX.OLrzqt;
                java.lang.String str2 = eGH.this.valueOf;
                if (str2 != null) {
                    return xzx2.OLrzqt(str2);
                }
                throw new java.lang.Exception("no unsignedData");
            }
            xZX xzx3 = xZX.OLrzqt;
            KeystoneSignAccountInfo keystoneSignAccountInfoOLrzqt = eGH.this.OLrzqt(abstractC12782ctV);
            KeystoneEvmSignType keystoneEvmSignType = eGH.this.gEmmrt;
            if (keystoneEvmSignType != null) {
                java.lang.String str3 = eGH.this.valueOf;
                if (str3 != null) {
                    return xzx3.EZpvd(keystoneSignAccountInfoOLrzqt, keystoneEvmSignType, str3);
                }
                throw new java.lang.Exception("no unsignedData");
            }
            throw new java.lang.Exception("no sign type");
        }
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(eGH egh, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        egh.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(eGH egh, java.lang.Throwable th) {
        pUU.copydefault(egh.getTAG(), "generateQRCode error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.eGJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        OLrzqt();
    }

    @Override // o.eGJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.eGJ
    public long EZpvd() {
        return getIntent().getLongExtra("chainCoinId", 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    @Override // o.eGJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String KWHzl(@NotNull KeystoneSignResult keystoneSignResult) {
        C10854bwM c10854bwM;
        C10854bwM c10854bwM2;
        C10854bwM c10854bwM3;
        java.lang.String strKWHzl;
        java.lang.String v;
        java.lang.String s;
        java.lang.String r;
        Intrinsics.checkNotNullParameter(keystoneSignResult, "");
        C10854bwM c10854bwM4 = this.EZpvd;
        if (c10854bwM4 == null || !c10854bwM4.ejfBZ()) {
            C10854bwM c10854bwM5 = this.EZpvd;
            if (c10854bwM5 != null && c10854bwM5.AxsJAYaxsJAY()) {
                C54904xZq c54904xZq = C54904xZq.copydefault;
                java.lang.String signature = keystoneSignResult.getSignature();
                if (signature == null) {
                    signature = "";
                }
                strKWHzl = c54904xZq.KWHzl(signature);
            } else {
                C10854bwM c10854bwM6 = this.EZpvd;
                strKWHzl = ((c10854bwM6 == null || !c10854bwM6.run()) && ((c10854bwM = this.EZpvd) == null || !c10854bwM.DLWbHP()) && (((c10854bwM2 = this.EZpvd) == null || !c10854bwM2.OqFWZa()) && ((c10854bwM3 = this.EZpvd) == null || !c10854bwM3.flVtFt()))) ? "" : keystoneSignResult.getSignature();
            }
        } else {
            KeystoneEvmSignType keystoneEvmSignType = this.gEmmrt;
            int i = keystoneEvmSignType == null ? -1 : Activity.KWHzl[keystoneEvmSignType.ordinal()];
            if (i == 1 || i == 2) {
                xZX xzx = xZX.OLrzqt;
                java.lang.String signature2 = keystoneSignResult.getSignature();
                if (signature2 == null) {
                    signature2 = "";
                }
                RSV rsvEZpvd = xzx.EZpvd(signature2);
                xYZ xyz = xYZ.KWHzl;
                C10854bwM c10854bwM7 = this.EZpvd;
                long jQKVWgx = c10854bwM7 != null ? c10854bwM7.QKVWgx() : 0L;
                KeystoneEvmSignType keystoneEvmSignType2 = this.gEmmrt;
                int i2 = keystoneEvmSignType2 != null ? Activity.KWHzl[keystoneEvmSignType2.ordinal()] : -1;
                int i3 = (i2 == 1 || i2 != 2) ? 0 : 2;
                java.lang.String str = this.OLrzqt;
                java.lang.String str2 = str == null ? "" : str;
                java.lang.String str3 = (rsvEZpvd == null || (r = rsvEZpvd.getR()) == null) ? "" : r;
                java.lang.String str4 = (rsvEZpvd == null || (s = rsvEZpvd.getS()) == null) ? "" : s;
                java.lang.String str5 = (rsvEZpvd == null || (v = rsvEZpvd.getV()) == null) ? "" : v;
                java.lang.String str6 = this.valueOf;
                strKWHzl = xyz.AEQbTJ(jQKVWgx, new EvmSignatureRawValue(i3, str2, str3, str4, str5, str6 == null ? "" : str6));
            } else if (i == 3 || i == 4) {
                java.lang.String signature3 = keystoneSignResult.getSignature();
                if (signature3 != null && C59449zhJ.AYXKKw(signature3, EIP1271Verifier.hexPrefix, true)) {
                    strKWHzl = keystoneSignResult.getSignature();
                } else {
                    java.lang.String signature4 = keystoneSignResult.getSignature();
                    if (signature4 == null) {
                        signature4 = "";
                    }
                    strKWHzl = EIP1271Verifier.hexPrefix + signature4;
                }
            }
        }
        return strKWHzl == null ? "" : strKWHzl;
    }

    @Override // o.eGJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eGJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
