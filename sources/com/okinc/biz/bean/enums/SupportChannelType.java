package com.okinc.biz.bean.enums;

import com.okinc.biz.bean.enums.SupportChannelType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.C6812aWT;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable(with = C6812aWT.class)
public final class SupportChannelType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SupportChannelType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;
    public static final SupportChannelType Chatbot = new SupportChannelType("Chatbot", 0, "CHATBOT");
    public static final SupportChannelType Form = new SupportChannelType("Form", 1, "FORM");
    public static final SupportChannelType Email = new SupportChannelType("Email", 2, "EMAIL");
    public static final SupportChannelType Article = new SupportChannelType("Article", 3, "ARTICLE");
    public static final SupportChannelType HelpCenter = new SupportChannelType("HelpCenter", 4, "HELP_CENTER");
    public static final SupportChannelType MinSupportPage = new SupportChannelType("MinSupportPage", 5, "MINI_SUPPORT_PAGE");
    public static final SupportChannelType RecentActivities = new SupportChannelType("RecentActivities", 6, "RECENT_ACTIVITIES");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SupportChannelType[] $values() {
        return new SupportChannelType[]{Chatbot, Form, Email, Article, HelpCenter, MinSupportPage, RecentActivities};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SupportChannelType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.bean.enums.SupportChannelType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) SupportChannelType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SupportChannelType> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C6812aWT();
    }

    private SupportChannelType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        SupportChannelType[] supportChannelTypeArr$values = $values();
        $VALUES = supportChannelTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(supportChannelTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.aWQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportChannelType._init_$_anonymous_();
            }
        });
    }

    public static SupportChannelType valueOf(String str) {
        return (SupportChannelType) Enum.valueOf(SupportChannelType.class, str);
    }

    public static SupportChannelType[] values() {
        return (SupportChannelType[]) $VALUES.clone();
    }
}
