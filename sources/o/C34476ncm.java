package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34476ncm {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final Json OLrzqt;
    public final Gson copydefault;

    public C34476ncm(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.OLrzqt = json;
        this.copydefault = gson;
    }

    public final JsonObject copydefault(@NotNull PnLExtraParams pnLExtraParams) {
        Intrinsics.checkNotNullParameter(pnLExtraParams, "");
        java.lang.Object objFromJson = this.copydefault.fromJson(this.OLrzqt.encodeToString(PnLExtraParams.Companion.serializer(), pnLExtraParams), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }

    public final C34462ncY copydefault(@NotNull PnLTransactionData pnLTransactionData) {
        Intrinsics.checkNotNullParameter(pnLTransactionData, "");
        long jValueOf = C33129mqd.valueOf(pnLTransactionData.KWHzl());
        java.lang.String strAYXKKw = pnLTransactionData.AYXKKw();
        TxType txTypeValueOf = pnLTransactionData.valueOf();
        java.lang.String strAhwBna = pnLTransactionData.AhwBna();
        return new C34462ncY(jValueOf, strAYXKKw, txTypeValueOf, C33129mqd.gEmmrt(java.lang.Long.valueOf(pnLTransactionData.OLrzqt())), pnLTransactionData.AEQbTJ(), strAhwBna, pnLTransactionData.djBIcL(), pnLTransactionData.copydefault());
    }

    /* JADX INFO: renamed from: o.ncm$ActionBar */
    public static final class ActionBar {

        /* JADX INFO: renamed from: o.ncm$ActionBar$TaskDescription */
        /* JADX INFO: loaded from: classes15.dex */
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ncm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String copydefault(@NotNull TxType txType) {
            Intrinsics.checkNotNullParameter(txType, "");
            int i = TaskDescription.EZpvd[txType.ordinal()];
            if (i == 1) {
                return C33070mpX.AYXKKw(C35964oKf.Fragment.zuBGHE);
            }
            if (i == 2) {
                return C33070mpX.AYXKKw(C35964oKf.Fragment.RuDPQV);
            }
            if (i == 3) {
                return C33070mpX.AYXKKw(C35964oKf.Fragment.YFmri);
            }
            if (i == 4) {
                return C33070mpX.AYXKKw(C35964oKf.Fragment.aGOrKO);
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return C33070mpX.AYXKKw(C35964oKf.Fragment.Rtjmuc);
        }
    }

    public final java.util.List<PnLTransactionData> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.OLrzqt;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(PnLTransactionData.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
