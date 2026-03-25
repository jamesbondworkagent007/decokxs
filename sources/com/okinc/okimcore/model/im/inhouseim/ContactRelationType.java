package com.okinc.okimcore.model.im.inhouseim;

import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44429sPm;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44429sPm.class)
public final class ContactRelationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContactRelationType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int apiValue;
    public static final ContactRelationType STRANGER = new ContactRelationType("STRANGER", 0, 0);
    public static final ContactRelationType ONE_WAY = new ContactRelationType("ONE_WAY", 1, 1);
    public static final ContactRelationType TWO_WAY = new ContactRelationType("TWO_WAY", 2, 2);
    public static final ContactRelationType UNKNOWN = new ContactRelationType("UNKNOWN", 3, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContactRelationType[] $values() {
        return new ContactRelationType[]{STRANGER, ONE_WAY, TWO_WAY, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContactRelationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    private ContactRelationType(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        ContactRelationType[] contactRelationTypeArr$values = $values();
        $VALUES = contactRelationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contactRelationTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ContactRelationType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ContactRelationType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) ContactRelationType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ContactRelationType> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44429sPm();
    }

    public static ContactRelationType valueOf(String str) {
        return (ContactRelationType) Enum.valueOf(ContactRelationType.class, str);
    }

    public static ContactRelationType[] values() {
        return (ContactRelationType[]) $VALUES.clone();
    }
}
