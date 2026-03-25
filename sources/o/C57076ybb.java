package o;

import com.keystone.module.TronSignature;
import com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignAccountInfo;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignResult;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneAccountsResp;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneSignResp;
import com.okinc.wallet.hardware.api.keystone.RSV;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57076ybb extends AbstractC43215rlA implements InterfaceC57029yah {
    public final C57013yaR copydefault;

    public C57076ybb(@NotNull C57013yaR c57013yaR) {
        Intrinsics.checkNotNullParameter(c57013yaR, "");
        this.copydefault = c57013yaR;
    }

    @Override // o.InterfaceC57029yah
    public ParseKeystoneAccountsResp OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.AEQbTJ(str);
    }

    @Override // o.InterfaceC57029yah
    public ParseKeystoneSignResp EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (j == 0) {
            return this.copydefault.AEQbTJ(str, new Function1() { // from class: o.yba
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57076ybb.gEmmrt(this.copydefault, (com.sparrowwallet.hummingbird.UR) obj);
                }
            });
        }
        if (j == 1) {
            return this.copydefault.AEQbTJ(str, new Function1() { // from class: o.ybe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57076ybb.valueOf(this.EZpvd, (com.sparrowwallet.hummingbird.UR) obj);
                }
            });
        }
        if (j == 2) {
            return this.copydefault.AEQbTJ(str, new Function1() { // from class: o.ybc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57076ybb.djBIcL(this.EZpvd, (com.sparrowwallet.hummingbird.UR) obj);
                }
            });
        }
        if (j == 5) {
            return this.copydefault.AEQbTJ(str, new Function1() { // from class: o.ybg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57076ybb.AYXKKw(this.KWHzl, (com.sparrowwallet.hummingbird.UR) obj);
                }
            });
        }
        if (j == 145) {
            return this.copydefault.AEQbTJ(str, new Function1() { // from class: o.ybj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57076ybb.values(this.copydefault, (com.sparrowwallet.hummingbird.UR) obj);
                }
            });
        }
        if (j == 195) {
            return this.copydefault.AEQbTJ(str, new Function1() { // from class: o.ybi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57076ybb.AkhnZx(this.copydefault, (com.sparrowwallet.hummingbird.UR) obj);
                }
            });
        }
        return new ParseKeystoneSignResp(-1, null);
    }

    public static final KeystoneSignResult gEmmrt(C57076ybb c57076ybb, com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        return new KeystoneSignResult(null, c57076ybb.copydefault.AEQbTJ(ur));
    }

    public static final KeystoneSignResult valueOf(C57076ybb c57076ybb, com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        com.keystone.module.Signature signatureCopydefault = c57076ybb.copydefault.copydefault(ur);
        return new KeystoneSignResult(signatureCopydefault.getRequestId(), signatureCopydefault.getSignature());
    }

    public static final KeystoneSignResult djBIcL(C57076ybb c57076ybb, com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        com.keystone.module.KeystoneSignResult keystoneSignResultDjBIcL = c57076ybb.copydefault.djBIcL(ur);
        return new KeystoneSignResult(keystoneSignResultDjBIcL.getRequestId(), keystoneSignResultDjBIcL.getRawData());
    }

    public static final KeystoneSignResult AYXKKw(C57076ybb c57076ybb, com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        com.keystone.module.KeystoneSignResult keystoneSignResultEZpvd = c57076ybb.copydefault.EZpvd(ur);
        return new KeystoneSignResult(keystoneSignResultEZpvd.getRequestId(), keystoneSignResultEZpvd.getRawData());
    }

    public static final KeystoneSignResult values(C57076ybb c57076ybb, com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        com.keystone.module.KeystoneSignResult keystoneSignResultKWHzl = c57076ybb.copydefault.KWHzl(ur);
        return new KeystoneSignResult(keystoneSignResultKWHzl.getRequestId(), keystoneSignResultKWHzl.getRawData());
    }

    public static final KeystoneSignResult AkhnZx(C57076ybb c57076ybb, com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        TronSignature tronSignatureValueOf = c57076ybb.copydefault.valueOf(ur);
        return new KeystoneSignResult(tronSignatureValueOf.getRequestId(), tronSignatureValueOf.getRaw());
    }

    @Override // o.InterfaceC57029yah
    public RSV EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.OLrzqt(str);
    }

    @Override // o.InterfaceC57029yah
    public AbstractC58185ywX<java.lang.String> KWHzl(@NotNull KeystoneSignAccountInfo keystoneSignAccountInfo, @NotNull KeystoneEvmSignType keystoneEvmSignType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(keystoneSignAccountInfo, "");
        Intrinsics.checkNotNullParameter(keystoneEvmSignType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.OLrzqt(keystoneSignAccountInfo.getRequestId(), keystoneSignAccountInfo.getChainId(), keystoneSignAccountInfo.getAddressPath(), keystoneSignAccountInfo.getMfp(), keystoneEvmSignType, str);
    }

    @Override // o.InterfaceC57029yah
    public AbstractC58185ywX<java.lang.String> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.KWHzl(str);
    }

    @Override // o.InterfaceC57029yah
    public AbstractC58185ywX<java.lang.String> copydefault(@NotNull KeystoneSignAccountInfo keystoneSignAccountInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(keystoneSignAccountInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        long chainId = keystoneSignAccountInfo.getChainId();
        if (chainId == 0) {
            C57013yaR c57013yaR = this.copydefault;
            java.lang.String psbt = keystoneSignAccountInfo.getPsbt();
            return c57013yaR.KWHzl(psbt != null ? psbt : "");
        }
        if (chainId == 1) {
            C57013yaR c57013yaR2 = this.copydefault;
            java.lang.String requestId = keystoneSignAccountInfo.getRequestId();
            long chainId2 = keystoneSignAccountInfo.getChainId();
            java.lang.String addressPath = keystoneSignAccountInfo.getAddressPath();
            java.lang.String mfp = keystoneSignAccountInfo.getMfp();
            KeystoneEvmSignType signType = keystoneSignAccountInfo.getSignType();
            if (signType != null) {
                return c57013yaR2.OLrzqt(requestId, chainId2, addressPath, mfp, signType, str);
            }
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception("no sign type"));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        if (chainId == 2) {
            return this.copydefault.KWHzl(str, keystoneSignAccountInfo.getRequestId(), keystoneSignAccountInfo.getMfp());
        }
        if (chainId == 5) {
            return this.copydefault.OLrzqt(str, keystoneSignAccountInfo.getRequestId(), keystoneSignAccountInfo.getMfp());
        }
        if (chainId == 145) {
            return this.copydefault.copydefault(str, keystoneSignAccountInfo.getRequestId(), keystoneSignAccountInfo.getMfp());
        }
        if (chainId == 195) {
            return this.copydefault.OLrzqt(keystoneSignAccountInfo.getRequestId(), str, keystoneSignAccountInfo.getAddressPath(), keystoneSignAccountInfo.getMfp(), keystoneSignAccountInfo.getTokenInfo());
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
