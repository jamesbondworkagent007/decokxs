package com.okinc.unify_trade.bot.constant;

import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import java.lang.annotation.Annotation;
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
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SubArbitrageType4Remote {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SubArbitrageType4Remote[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("stake")
    public static final SubArbitrageType4Remote STAKE = new SubArbitrageType4Remote("STAKE", 0);

    @SerialName("")
    public static final SubArbitrageType4Remote EMPTY = new SubArbitrageType4Remote("EMPTY", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SubArbitrageType4Remote[] $values() {
        return new SubArbitrageType4Remote[]{STAKE, EMPTY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SubArbitrageType4Remote> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) SubArbitrageType4Remote.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SubArbitrageType4Remote> serializer() {
            return KWHzl();
        }
    }

    private SubArbitrageType4Remote(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote", values(), new String[]{"stake", ""}, new Annotation[][]{null, null}, null);
    }

    static {
        SubArbitrageType4Remote[] subArbitrageType4RemoteArr$values = $values();
        $VALUES = subArbitrageType4RemoteArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(subArbitrageType4RemoteArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xqG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SubArbitrageType4Remote._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return StringsKt__StringsKt.substringAfterLast$default(Companion.serializer().getDescriptor().getElementDescriptor(ordinal()).getSerialName(), '.', (String) null, 2, (Object) null);
    }

    public static SubArbitrageType4Remote valueOf(String str) {
        return (SubArbitrageType4Remote) Enum.valueOf(SubArbitrageType4Remote.class, str);
    }

    public static SubArbitrageType4Remote[] values() {
        return (SubArbitrageType4Remote[]) $VALUES.clone();
    }
}
