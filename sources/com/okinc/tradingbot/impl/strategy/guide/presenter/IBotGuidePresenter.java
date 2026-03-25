package com.okinc.tradingbot.impl.strategy.guide.presenter;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C33070mpX;
import o.C55688xof;
import o.C55887xsS;
import o.C56111xwe;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public interface IBotGuidePresenter {
    void OLrzqt(@NotNull String str, @NotNull C55887xsS c55887xsS, String str2, Bundle bundle);

    C56111xwe<List<BotGuideCoinItem>> ejfBZ();

    C56111xwe<ButtonState> fARcdN();

    C56111xwe<Unit> fJNWhG();

    C56111xwe<Pair<Boolean, Exception>> iwGUEr();

    Pair<String, String> uzCIH();

    public interface ButtonState {
        Integer getBgColor();

        int getButtonType();

        boolean getEnabled();

        String getText();

        Integer getTextColor();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Generic implements ButtonState {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Generic[] $VALUES;
            public static final Generic Disabled;
            public static final Generic Enabled;
            public static final Generic Long;
            public static final Generic NeedLogin;
            public static final Generic NeedUpgrade;
            public static final Generic Short;
            private final Integer bgColor;
            private final int buttonType;
            private final boolean enabled;
            private final String text;
            private final Integer textColor;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Generic[] $values() {
                return new Generic[]{Enabled, Disabled, Long, Short, NeedLogin, NeedUpgrade};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Generic> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public Integer getBgColor() {
                return this.bgColor;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public int getButtonType() {
                return this.buttonType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public boolean getEnabled() {
                return this.enabled;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public String getText() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public Integer getTextColor() {
                return this.textColor;
            }

            private Generic(String str, @ColorInt int i, @ColorInt String str2, Integer num, Integer num2, boolean z, int i2) {
                this.text = str2;
                this.textColor = num;
                this.bgColor = num2;
                this.enabled = z;
                this.buttonType = i2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.xof.Application.setActiveQueueItemId int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:39)) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000d: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (r15v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (257 int) : (r16v0 int))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, int):void (m)] (LINE:38) call: com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState.Generic.<init>(java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, int):void type: THIS */
            public /* synthetic */ Generic(String str, int i, String str2, Integer num, Integer num2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, (i3 & 1) != 0 ? C33070mpX.AYXKKw(C55688xof.Application.setActiveQueueItemId) : str2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2, z, (i3 & 16) != 0 ? 257 : i2);
            }

            static {
                Integer num = null;
                Enabled = new Generic("Enabled", 0, null, null, num, true, 0, 23, null);
                String str = null;
                Integer num2 = null;
                Integer num3 = null;
                DefaultConstructorMarker defaultConstructorMarker = null;
                Disabled = new Generic("Disabled", 1, str, num2, num3, false, 0, 23, defaultConstructorMarker);
                Integer num4 = null;
                boolean z = true;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                Long = new Generic("Long", 2, 0 == true ? 1 : 0, num, num4, z, 261, 7, defaultConstructorMarker2);
                Short = new Generic("Short", 3, str, num2, num3, true, 262, 7, defaultConstructorMarker);
                int i = 0;
                int i2 = 22;
                NeedLogin = new Generic("NeedLogin", 4, C33070mpX.AYXKKw(C55688xof.Application.access001), num, num4, z, i, i2, defaultConstructorMarker2);
                NeedUpgrade = new Generic("NeedUpgrade", 5, C33070mpX.AYXKKw(C55688xof.Application.init), num, num4, z, i, i2, defaultConstructorMarker2);
                Generic[] genericArr$values = $values();
                $VALUES = genericArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(genericArr$values);
            }

            public static Generic valueOf(String str) {
                return (Generic) Enum.valueOf(Generic.class, str);
            }

            public static Generic[] values() {
                return (Generic[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class AirdropButtonState implements ButtonState {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ AirdropButtonState[] $VALUES;
            public static final AirdropButtonState Disabled;
            public static final AirdropButtonState Enabled;
            public static final AirdropButtonState Long;
            public static final AirdropButtonState Short;
            private final Integer bgColor;
            private final int buttonType;
            private final boolean enabled;
            private final String text;
            private final Integer textColor;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ AirdropButtonState[] $values() {
                return new AirdropButtonState[]{Long, Short, Enabled, Disabled};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<AirdropButtonState> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public Integer getBgColor() {
                return this.bgColor;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public int getButtonType() {
                return this.buttonType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public boolean getEnabled() {
                return this.enabled;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public String getText() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState
            public Integer getTextColor() {
                return this.textColor;
            }

            private AirdropButtonState(String str, @ColorInt int i, @ColorInt String str2, Integer num, Integer num2, boolean z, int i2) {
                this.text = str2;
                this.textColor = num;
                this.bgColor = num2;
                this.enabled = z;
                this.buttonType = i2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.xof.Application.SFHvfSaKzXkR int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:70)) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000d: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (r15v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (257 int) : (r16v0 int))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, int):void (m)] (LINE:69) call: com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter.ButtonState.AirdropButtonState.<init>(java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, int):void type: THIS */
            public /* synthetic */ AirdropButtonState(String str, int i, String str2, Integer num, Integer num2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, (i3 & 1) != 0 ? C33070mpX.AYXKKw(C55688xof.Application.SFHvfSaKzXkR) : str2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2, z, (i3 & 16) != 0 ? 257 : i2);
            }

            static {
                Integer num = null;
                Long = new AirdropButtonState("Long", 0, null, null, num, true, 261, 7, null);
                String str = null;
                Integer num2 = null;
                Integer num3 = null;
                DefaultConstructorMarker defaultConstructorMarker = null;
                Short = new AirdropButtonState("Short", 1, str, num2, num3, true, 262, 7, defaultConstructorMarker);
                Enabled = new AirdropButtonState("Enabled", 2, 0 == true ? 1 : 0, num, null, true, 257, 7, null);
                Disabled = new AirdropButtonState("Disabled", 3, str, num2, num3, false, 0, 23, defaultConstructorMarker);
                AirdropButtonState[] airdropButtonStateArr$values = $values();
                $VALUES = airdropButtonStateArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(airdropButtonStateArr$values);
            }

            public static AirdropButtonState valueOf(String str) {
                return (AirdropButtonState) Enum.valueOf(AirdropButtonState.class, str);
            }

            public static AirdropButtonState[] values() {
                return (AirdropButtonState[]) $VALUES.clone();
            }
        }
    }
}
