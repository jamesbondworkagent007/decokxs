package o;

import com.okinc.tradingbot.impl.planet.dto.BotDto;
import com.okinc.tradingbot.impl.planet.model.BotDisplayType;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C53671wpr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53672wps extends vNA<BotDto, BotUiState> {
    public final C53671wpr EZpvd;
    public final C53669wpp KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C53672wps(@NotNull C53671wpr c53671wpr, @NotNull C53669wpp c53669wpp) {
        Intrinsics.checkNotNullParameter(c53671wpr, "");
        Intrinsics.checkNotNullParameter(c53669wpp, "");
        this.EZpvd = c53671wpr;
        this.KWHzl = c53669wpp;
    }

    /* JADX INFO: renamed from: o.wps$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wps.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.vNA
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public BotUiState KWHzl(@NotNull BotDto botDto) {
        Intrinsics.checkNotNullParameter(botDto, "");
        PlanetBotMetadata planetBotMetadataAEQbTJ = this.KWHzl.AEQbTJ(botDto);
        return this.EZpvd.AEQbTJ(new C53671wpr.ActionBar(planetBotMetadataAEQbTJ, false, BotDisplayType.Companion.KWHzl(planetBotMetadataAEQbTJ.gEmmrt()), false));
    }
}
