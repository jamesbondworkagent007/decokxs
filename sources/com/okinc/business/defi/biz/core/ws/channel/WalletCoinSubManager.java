package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletCoinSubManager;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10404bnn;
import o.C10407bnq;
import o.C10854bwM;
import o.C10954byG;
import o.C11205cFp;
import o.C11607cUn;
import o.C12827cuN;
import o.C33129mqd;
import o.C56390yDp;
import o.C9934beu;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.InterfaceC60096zvd;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCoinSubManager extends xZF<SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Pair AEQbTJ(Pair pair, C10404bnn c10404bnn) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        return pair;
    }

    public WalletCoinSubManager() {
        super("wallet-coin", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    public static final InterfaceC60096zvd fetchVPNInfo(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.xZF
    public boolean OLrzqt(@NotNull final List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinSubManager.EZpvd(list, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinSubManager.fetchVPNInfo(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cGf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinSubManager.EZpvd((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cGi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinSubManager.DbNXlk(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cGg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinSubManager.djBIcL((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.cGj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinSubManager.AuCTel(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinSubManager.OLrzqt((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58185ywXKWHzl2.copydefault(new InterfaceC58229yxO() { // from class: o.cGk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinSubManager.AYXKKw(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.cFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinSubManager.copydefault((java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletCoinSubManager.gEmmrt(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.cFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinSubManager.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletCoinSubManager.AkhnZx(function16, obj);
            }
        });
        return true;
    }

    public static final InterfaceC60096zvd EZpvd(List list, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        final SubResponse subResponse = (SubResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (subResponse == null) {
            subResponse = new SubResponse((String) null, 0L, false, 7, (DefaultConstructorMarker) null);
        }
        String address = subResponse.getAddress();
        if (abstractC12782ctV.DbNXlk(address != null ? address : "") && C33129mqd.OLrzqt((CharSequence) subResponse.getAddress())) {
            C10954byG c10954byG = C10954byG.EZpvd;
            c10954byG.AYXKKw().EZpvd(true);
            AbstractC58185ywX<Boolean> abstractC58185ywXGEmmrt = c10954byG.AYXKKw().gEmmrt();
            final Function1 function1 = new Function1() { // from class: o.cFZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletCoinSubManager.KWHzl(abstractC12782ctV, subResponse, (java.lang.Boolean) obj);
                }
            };
            return abstractC58185ywXGEmmrt.copydefault(new InterfaceC58229yxO() { // from class: o.cGa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return WalletCoinSubManager.values(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(abstractC12782ctV, subResponse));
    }

    public static final InterfaceC58261yxu values(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(AbstractC12782ctV abstractC12782ctV, SubResponse subResponse, Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(abstractC12782ctV, subResponse));
    }

    public static final Pair DbNXlk(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair EZpvd(Pair pair) throws Exception {
        Intrinsics.checkNotNullParameter(pair, "");
        if (C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(((SubResponse) pair.getSecond()).getCoinId())) != null) {
            return pair;
        }
        throw new Exception("");
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(final Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        C10407bnq.ActionBar actionBar = C10407bnq.Companion;
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null);
        String strDbNXlk = ((AbstractC12782ctV) pair.getFirst()).DbNXlk();
        long coinId = ((SubResponse) pair.getSecond()).getCoinId();
        C10407bnq instance$default2 = C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null);
        Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC58185ywX abstractC58185ywXRefreshWalletSingleCoinAsset$default = C10407bnq.refreshWalletSingleCoinAsset$default(instance$default, strDbNXlk, coinId, null, false, instance$default2.KWHzl((AbstractC12782ctV) first), 4, null);
        final Function1 function1 = new Function1() { // from class: o.cGe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinSubManager.AEQbTJ(pair, (C10404bnn) obj);
            }
        };
        return abstractC58185ywXRefreshWalletSingleCoinAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cGd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinSubManager.isConnected(function1, obj);
            }
        });
    }

    public static final Pair isConnected(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) first;
        SubResponse subResponse = (SubResponse) pair.getSecond();
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(subResponse.getCoinId()));
        ArrayList arrayList = new ArrayList();
        if (c10854bwMKWHzl != null && subResponse.getShow()) {
            String strOcIXYQ = c10854bwMKWHzl.OcIXYQ();
            if (abstractC12782ctV.KWHzl(strOcIXYQ) && !abstractC12782ctV.fetchVPNInfo(strOcIXYQ)) {
                arrayList.add(abstractC12782ctV.OLrzqt(strOcIXYQ, true));
            }
        }
        return C11607cUn.KWHzl(arrayList);
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(List list) {
        RxBus.AEQbTJ(new C9934beu());
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        private final String address;
        private final long coinId;
        private boolean show;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((String) null, 0L, false, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, String str, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subResponse.address;
            }
            if ((i & 2) != 0) {
                j = subResponse.coinId;
            }
            if ((i & 4) != 0) {
                z = subResponse.show;
            }
            return subResponse.copy(str, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.show;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, long j, boolean z) {
            return new SubResponse(str, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponse)) {
                return false;
            }
            SubResponse subResponse = (SubResponse) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && this.coinId == subResponse.coinId && this.show == subResponse.show;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShow() {
            return this.show;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.coinId)) * 31) + Boolean.hashCode(this.show);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShow(boolean z) {
            this.show = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(address=" + this.address + ", coinId=" + this.coinId + ", show=" + this.show + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletCoinSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletCoinSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, long j, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.address = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.coinId = -1L;
            } else {
                this.coinId = j;
            }
            if ((i & 4) == 0) {
                this.show = false;
            } else {
                this.show = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponse.coinId != -1) {
                compositeEncoder.encodeLongElement(serialDescriptor, 1, subResponse.coinId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponse.show) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, subResponse.show);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r2v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, long, boolean):void (m)] (LINE:81) call: com.okinc.business.defi.biz.core.ws.channel.WalletCoinSubManager.SubResponse.<init>(java.lang.String, long, boolean):void type: THIS */
        public /* synthetic */ SubResponse(String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? false : z);
        }

        public SubResponse(String str, long j, boolean z) {
            this.address = str;
            this.coinId = j;
            this.show = z;
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return String.valueOf(this.coinId);
        }
    }
}
