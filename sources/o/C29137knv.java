package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.business.market.data.model.position_pnl.PnLTransactionData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29137knv {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final Json AEQbTJ;
    public final Gson KWHzl;

    public C29137knv(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.AEQbTJ = json;
        this.KWHzl = gson;
    }

    public final JsonObject OLrzqt(@NotNull PnLExtraParams pnLExtraParams) {
        Intrinsics.checkNotNullParameter(pnLExtraParams, "");
        java.lang.Object objFromJson = this.KWHzl.fromJson(this.AEQbTJ.encodeToString(PnLExtraParams.Companion.serializer(), pnLExtraParams), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }

    public final C29182kon OLrzqt(@NotNull PnLTransactionData pnLTransactionData) {
        Intrinsics.checkNotNullParameter(pnLTransactionData, "");
        long jValueOf = C33129mqd.valueOf(pnLTransactionData.copydefault());
        java.lang.String strDjBIcL = pnLTransactionData.djBIcL();
        TxType txTypeAhwBna = pnLTransactionData.AhwBna();
        java.lang.String strAYXKKw = pnLTransactionData.AYXKKw();
        return new C29182kon(jValueOf, strDjBIcL, txTypeAhwBna, C33129mqd.gEmmrt(java.lang.Long.valueOf(pnLTransactionData.AEQbTJ())), pnLTransactionData.EZpvd(), strAYXKKw, pnLTransactionData.gEmmrt(), pnLTransactionData.OLrzqt());
    }

    /* JADX INFO: renamed from: o.knv$Application */
    public static final class Application {

        /* JADX INFO: renamed from: o.knv$Application$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TxType.values().length];
                try {
                    iArr[TxType.ALL.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TxType.BUY.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TxType.SELL.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[TxType.TRANSFER_IN.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[TxType.TRANSFER_OUT.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.knv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String OLrzqt(@NotNull TxType txType) {
            Intrinsics.checkNotNullParameter(txType, "");
            int i = TaskDescription.EZpvd[txType.ordinal()];
            if (i == 1) {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.KWHzl);
            }
            if (i == 2) {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.OFnBcz);
            }
            if (i == 3) {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.gezFCt);
            }
            if (i == 4) {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.zNQIcI);
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return C33070mpX.AYXKKw(C23274hvD.Fragment.iFnJKK);
        }
    }

    public final java.util.List<PnLTransactionData> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.AEQbTJ;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(PnLTransactionData.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
