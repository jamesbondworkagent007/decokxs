package o;

import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonMintlessJettonInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.C13754dXa;
import o.InterfaceC11834cbZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11834cbZ extends InterfaceC11891ccd, InterfaceC9747bbS {
    TonMintlessJettonInfo AYXKKw();

    boolean DbNXlk();

    void OLrzqt(@NotNull TonMintlessJettonInfo tonMintlessJettonInfo);

    java.lang.String djBIcL();

    java.lang.String gEmmrt();

    boolean isConnected();

    /* JADX INFO: renamed from: o.cbZ$StateListAnimator */
    public static final class StateListAnimator {
        public static boolean OLrzqt(@NotNull InterfaceC11834cbZ interfaceC11834cbZ) {
            return C33129mqd.OLrzqt((java.lang.CharSequence) interfaceC11834cbZ.AEQbTJ().getCustomPayload());
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC11834cbZ interfaceC11834cbZ) {
            java.lang.String stateInit;
            return (!interfaceC11834cbZ.DbNXlk() || (stateInit = interfaceC11834cbZ.AEQbTJ().getStateInit()) == null) ? "" : stateInit;
        }

        public static java.lang.String copydefault(@NotNull InterfaceC11834cbZ interfaceC11834cbZ) {
            if (!interfaceC11834cbZ.DbNXlk()) {
                return "";
            }
            java.lang.String customPayload = interfaceC11834cbZ.AEQbTJ().getCustomPayload();
            Intrinsics.copydefault((java.lang.Object) customPayload);
            return customPayload;
        }

        /* JADX DEBUG: Type inference failed for r4v6. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
        public static AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull final InterfaceC11834cbZ interfaceC11834cbZ) {
            java.lang.Integer status = interfaceC11834cbZ.AEQbTJ().getStatus();
            if (status == null || status.intValue() != 1) {
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
                return abstractC58185ywXKWHzl;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) interfaceC11834cbZ.AEQbTJ().getCustomPayload())) {
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
                return abstractC58185ywXKWHzl2;
            }
            TonMintlessJettonInfo tonMintlessJettonInfoAYXKKw = interfaceC11834cbZ.AYXKKw();
            if (tonMintlessJettonInfoAYXKKw != null) {
                EZpvd(interfaceC11834cbZ, tonMintlessJettonInfoAYXKKw);
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
                return abstractC58185ywXKWHzl3;
            }
            java.lang.String claimInfoUrl = interfaceC11834cbZ.AEQbTJ().getClaimInfoUrl();
            if (claimInfoUrl == null || claimInfoUrl.length() == 0) {
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(KWHzl(interfaceC11834cbZ));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
                return abstractC58185ywXKWHzl4;
            }
            C13928dbo c13928dbo = new C13928dbo();
            java.lang.String claimInfoUrl2 = interfaceC11834cbZ.AEQbTJ().getClaimInfoUrl();
            Intrinsics.copydefault((java.lang.Object) claimInfoUrl2);
            AbstractC58185ywX<JsonObject> abstractC58185ywXAEQbTJ = c13928dbo.AEQbTJ(claimInfoUrl2);
            final Function1 function1 = new Function1() { // from class: o.cca
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC11834cbZ.StateListAnimator.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX<JsonObject> abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.ccb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC11834cbZ.StateListAnimator.KWHzl(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.ccf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC11834cbZ.StateListAnimator.copydefault(interfaceC11834cbZ, (JsonObject) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC11834cbZ.StateListAnimator.OLrzqt(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
            return abstractC58185ywXAEQbTJ2;
        }

        public static JsonObject KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (JsonObject) function1.invoke(obj);
        }

        public static JsonObject AEQbTJ(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.copydefault("TonMintlessInfo", "request onError: " + C56379yDe.AEQbTJ(th));
            return new JsonObject(C56424yEw.KWHzl());
        }

        public static kotlin.Pair OLrzqt(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (kotlin.Pair) function1.invoke(obj);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x001b */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [o.cbZ] */
        /* JADX WARN: Type inference failed for: r3v1, types: [o.cbZ] */
        /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Pair] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        public static kotlin.Pair copydefault(InterfaceC11834cbZ interfaceC11834cbZ, JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            pUU.copydefault("TonMintlessInfo", "request onSuccess: " + jsonObject);
            try {
                TonMintlessJettonInfo tonMintlessJettonInfo = (TonMintlessJettonInfo) C54907xZt.OLrzqt(TonMintlessJettonInfo.Companion.serializer(), jsonObject.toString());
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tonMintlessJettonInfo.getCustomPayload()) && C33129mqd.OLrzqt((java.lang.CharSequence) tonMintlessJettonInfo.getJettonWallet())) {
                    interfaceC11834cbZ.OLrzqt(tonMintlessJettonInfo);
                    EZpvd((InterfaceC11834cbZ) interfaceC11834cbZ, tonMintlessJettonInfo);
                    interfaceC11834cbZ = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
                } else {
                    interfaceC11834cbZ = KWHzl(interfaceC11834cbZ);
                }
                return interfaceC11834cbZ;
            } catch (java.lang.Throwable th) {
                pUU.copydefault("TonMintlessInfo", "parse json error: " + th.getMessage());
                return KWHzl(interfaceC11834cbZ);
            }
        }

        public static void EZpvd(InterfaceC11834cbZ interfaceC11834cbZ, TonMintlessJettonInfo tonMintlessJettonInfo) {
            interfaceC11834cbZ.AEQbTJ().setFromJettonAccount(tonMintlessJettonInfo.getJettonWallet());
            interfaceC11834cbZ.AEQbTJ().setStateInit(tonMintlessJettonInfo.getStateInit());
            interfaceC11834cbZ.AEQbTJ().setCustomPayload(tonMintlessJettonInfo.getCustomPayload());
        }

        public static kotlin.Pair<java.lang.Boolean, java.lang.String> KWHzl(InterfaceC11834cbZ interfaceC11834cbZ) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.component1));
        }
    }
}
