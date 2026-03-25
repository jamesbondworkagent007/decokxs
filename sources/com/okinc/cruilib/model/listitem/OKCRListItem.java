package com.okinc.cruilib.model.listitem;

import com.okinc.cruilib.model.listitem.OKCRListItem;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public abstract class OKCRListItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mHH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKCRListItem._init_$_anonymous_();
        }
    });

    public static final /* synthetic */ void write$Self(OKCRListItem oKCRListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract String getId();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.OKCRListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) OKCRListItem.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKCRListItem> serializer() {
            return EZpvd();
        }
    }

    public OKCRListItem() {
    }

    public /* synthetic */ OKCRListItem(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(OKCRListItem.class), new Annotation[0]);
    }
}
