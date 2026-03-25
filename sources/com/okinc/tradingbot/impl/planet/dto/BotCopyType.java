package com.okinc.tradingbot.impl.planet.dto;

import com.okinc.tradingbot.impl.planet.dto.BotCopyType;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotCopyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotCopyType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("1")
    public static final BotCopyType Copying = new BotCopyType("Copying", 0);

    @SerialName("2")
    public static final BotCopyType CopyTrading = new BotCopyType("CopyTrading", 1);

    @SerialName("3")
    public static final BotCopyType Leading = new BotCopyType("Leading", 2);

    @SerialName("")
    public static final BotCopyType NotSpecified = new BotCopyType("NotSpecified", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotCopyType[] $values() {
        return new BotCopyType[]{Copying, CopyTrading, Leading, NotSpecified};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotCopyType> getEntries() {
        return $ENTRIES;
    }

    private BotCopyType(String str, int i) {
    }

    static {
        BotCopyType[] botCopyTypeArr$values = $values();
        $VALUES = botCopyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botCopyTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.wpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotCopyType._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return StringsKt__StringsKt.substringAfterLast$default(Companion.serializer().getDescriptor().getElementDescriptor(ordinal()).getSerialName(), '.', (String) null, 2, (Object) null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.dto.BotCopyType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) BotCopyType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BotCopyType> serializer() {
            return KWHzl();
        }

        public final BotCopyType EZpvd(String str) {
            BotCopyType next;
            Iterator<BotCopyType> it = BotCopyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C59449zhJ.gEmmrt(next.toString(), str, true)) {
                    break;
                }
            }
            BotCopyType botCopyType = next;
            return botCopyType == null ? BotCopyType.NotSpecified : botCopyType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.tradingbot.impl.planet.dto.BotCopyType", values(), new String[]{"1", "2", "3", ""}, new Annotation[][]{null, null, null, null}, null);
    }

    public static BotCopyType valueOf(String str) {
        return (BotCopyType) Enum.valueOf(BotCopyType.class, str);
    }

    public static BotCopyType[] values() {
        return (BotCopyType[]) $VALUES.clone();
    }
}
