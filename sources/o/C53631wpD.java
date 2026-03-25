package o;

import com.okinc.tradingbot.impl.planet.dto.BotDto;
import com.okinc.tradingbot.impl.planet.dto.RecurringBotDto;
import com.okinc.tradingbot.impl.planet.dto.SignalBotDto;
import com.okinc.tradingbot.impl.planet.dto.SmartArbitrageBotDto;
import com.okinc.tradingbot.impl.planet.dto.SmartPortfolioBotDto;
import com.okinc.tradingbot.impl.planet.dto.SpotBotDto;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53631wpD extends JsonContentPolymorphicSerializer<BotDto> {
    public static final C53631wpD copydefault = new C53631wpD();

    private C53631wpD() {
        super(C56524yIo.AEQbTJ(BotDto.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [29=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r2.equals("dcd_bot") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r2.equals("grid") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r2.equals("contract_grid") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r2.equals("contract_dca") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r2.equals("spot_dca") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return com.okinc.tradingbot.impl.planet.dto.ContractBotDto.Companion.serializer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return com.okinc.tradingbot.impl.planet.dto.SpotBotDto.Companion.serializer();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializationStrategy<BotDto> selectDeserializer(@NotNull JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "ordType");
        java.lang.String content = (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            switch (content.hashCode()) {
                case -1831183611:
                    break;
                case -1402017003:
                    break;
                case -1216369070:
                    if (content.equals("smart_portfolio")) {
                        return SmartPortfolioBotDto.Companion.serializer();
                    }
                    break;
                case -1086683216:
                    if (content.equals("signal_bot")) {
                        return SignalBotDto.Companion.serializer();
                    }
                    break;
                case -557961837:
                    if (content.equals("smart_arbitrage")) {
                        return SmartArbitrageBotDto.Companion.serializer();
                    }
                    break;
                case -512749997:
                    break;
                case 3181382:
                    break;
                case 1165749981:
                    if (content.equals("recurring")) {
                        return RecurringBotDto.Companion.serializer();
                    }
                    break;
                case 1485620813:
                    break;
            }
        }
        return SpotBotDto.Companion.serializer();
    }
}
