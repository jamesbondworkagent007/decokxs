package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UIAlignment {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UIAlignment[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("leading")
    public static final UIAlignment Leading = new UIAlignment("Leading", 0);

    @SerialName("trailing")
    public static final UIAlignment Trailing = new UIAlignment("Trailing", 1);

    @SerialName(TtmlNode.CENTER)
    public static final UIAlignment Center = new UIAlignment("Center", 2);

    @SerialName("stretch")
    public static final UIAlignment Stretch = new UIAlignment("Stretch", 3);

    @SerialName("space-between")
    public static final UIAlignment SpaceBetween = new UIAlignment("SpaceBetween", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UIAlignment[] $values() {
        return new UIAlignment[]{Leading, Trailing, Center, Stretch, SpaceBetween};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UIAlignment> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) UIAlignment.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<UIAlignment> serializer() {
            return copydefault();
        }
    }

    private UIAlignment(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment", values(), new String[]{"leading", "trailing", TtmlNode.CENTER, "stretch", "space-between"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    static {
        UIAlignment[] uIAlignmentArr$values = $values();
        $VALUES = uIAlignmentArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uIAlignmentArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UIAlignment._init_$_anonymous_();
            }
        });
    }

    public static UIAlignment valueOf(String str) {
        return (UIAlignment) Enum.valueOf(UIAlignment.class, str);
    }

    public static UIAlignment[] values() {
        return (UIAlignment[]) $VALUES.clone();
    }
}
