package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.market.data.constant.LiquidityChangeType;
import com.okinc.business.market.data.model.LiquidityChangeData;
import com.okinc.business.market.data.model.TokenChangeData;
import com.okinc.business.market.data.model.TokenFilterData;
import com.okinc.business.market.features.coindetail_liquidity.domain.LiquidityChange;
import com.okinc.business.market.features.coindetail_liquidity.domain.TokenChange;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPR {
    public final Gson KWHzl;
    public final Json OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public jPR(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.OLrzqt = json;
        this.KWHzl = gson;
    }

    public final TokenFilterData AEQbTJ(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        return new TokenFilterData(tokenFilter.KWHzl(), tokenFilter.isConnected(), tokenFilter.DbNXlk(), tokenFilter.AYXKKw().AhwBna(), tokenFilter.AYXKKw().KWHzl(), tokenFilter.OLrzqt());
    }

    public final JsonObject copydefault(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        TokenFilterData tokenFilterDataAEQbTJ = AEQbTJ(tokenFilter);
        Json json = this.OLrzqt;
        json.getSerializersModule();
        java.lang.Object objFromJson = this.KWHzl.fromJson(json.encodeToString(TokenFilterData.Companion.serializer(), tokenFilterDataAEQbTJ), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }

    public final LiquidityChange KWHzl(@NotNull LiquidityChangeData liquidityChangeData) {
        Intrinsics.checkNotNullParameter(liquidityChangeData, "");
        java.lang.String strGEmmrt = liquidityChangeData.gEmmrt();
        java.lang.String strCopydefault = liquidityChangeData.copydefault();
        java.lang.String strOLrzqt = liquidityChangeData.OLrzqt();
        LiquidityChangeType liquidityChangeTypeDbNXlk = liquidityChangeData.DbNXlk();
        java.lang.String strAYXKKw = liquidityChangeData.AYXKKw();
        java.lang.String strDjBIcL = liquidityChangeData.djBIcL();
        java.lang.String strAkhnZx = liquidityChangeData.AkhnZx();
        java.lang.String strIsConnected = liquidityChangeData.isConnected();
        java.lang.String strFetchVPNInfo = liquidityChangeData.fetchVPNInfo();
        java.util.List<TokenChangeData> listAEQbTJ = liquidityChangeData.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((TokenChangeData) it.next()));
        }
        return new LiquidityChange(strGEmmrt, strCopydefault, strOLrzqt, liquidityChangeTypeDbNXlk, strAYXKKw, strDjBIcL, strAkhnZx, strIsConnected, strFetchVPNInfo, arrayList, liquidityChangeData.valueOf(), liquidityChangeData.KWHzl(), liquidityChangeData.AhwBna());
    }

    public final C26072jQx EZpvd(@NotNull LiquidityChange liquidityChange) {
        Intrinsics.checkNotNullParameter(liquidityChange, "");
        return new C26072jQx(liquidityChange.OLrzqt(), liquidityChange.AYXKKw(), liquidityChange.AEQbTJ(), liquidityChange.KWHzl(), liquidityChange.djBIcL(), liquidityChange.AhwBna(), liquidityChange.copydefault(), liquidityChange.EZpvd(), liquidityChange.valueOf(), liquidityChange.gEmmrt());
    }

    public final TokenChange KWHzl(TokenChangeData tokenChangeData) {
        return new TokenChange(tokenChangeData.AEQbTJ(), tokenChangeData.KWHzl());
    }

    public static final class TaskDescription {

        /* JADX INFO: renamed from: o.jPR$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final /* synthetic */ class C0860TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[LiquidityChangeType.values().length];
                try {
                    iArr[LiquidityChangeType.All.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[LiquidityChangeType.Add.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[LiquidityChangeType.Remove.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jPR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String copydefault(@NotNull android.content.Context context, @NotNull LiquidityChangeType liquidityChangeType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(liquidityChangeType, "");
            int i = C0860TaskDescription.AEQbTJ[liquidityChangeType.ordinal()];
            if (i == 1) {
                java.lang.String string = context.getString(C23274hvD.Fragment.onStatusChanged);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i == 2) {
                java.lang.String string2 = context.getString(C23274hvD.Fragment.ComponentActivity2);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return string2;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String string3 = context.getString(C23274hvD.Fragment.ComponentActivityExternalSyntheticLambda0);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
    }

    public final LiquidityChange copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.OLrzqt;
            json.getSerializersModule();
            return KWHzl((LiquidityChangeData) json.decodeFromString(LiquidityChangeData.Companion.serializer(), str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
