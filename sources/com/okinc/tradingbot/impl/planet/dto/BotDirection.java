package com.okinc.tradingbot.impl.planet.dto;

import com.okinc.tradingbot.impl.planet.dto.BotDirection;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotDirection[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("long")
    public static final BotDirection Long = new BotDirection("Long", 0);

    @SerialName("short")
    public static final BotDirection Short = new BotDirection("Short", 1);

    @SerialName("neutral")
    public static final BotDirection Neutral = new BotDirection("Neutral", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotDirection[] $values() {
        return new BotDirection[]{Long, Short, Neutral};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotDirection> getEntries() {
        return $ENTRIES;
    }

    private BotDirection(String str, int i) {
    }

    static {
        BotDirection[] botDirectionArr$values = $values();
        $VALUES = botDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botDirectionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.wpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotDirection._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return StringsKt__StringsKt.substringAfterLast$default(Companion.serializer().getDescriptor().getElementDescriptor(ordinal()).getSerialName(), '.', (String) null, 2, (Object) null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.dto.BotDirection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) BotDirection.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BotDirection> serializer() {
            return OLrzqt();
        }

        public final BotDirection EZpvd(@NotNull String str) {
            BotDirection next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<BotDirection> it = BotDirection.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.toString(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.tradingbot.impl.planet.dto.BotDirection", values(), new String[]{"long", "short", "neutral"}, new Annotation[][]{null, null, null}, null);
    }

    public static BotDirection valueOf(String str) {
        return (BotDirection) Enum.valueOf(BotDirection.class, str);
    }

    public static BotDirection[] values() {
        return (BotDirection[]) $VALUES.clone();
    }
}
