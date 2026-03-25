package com.okinc.business.invest_biz.ui.widget.filter;

import com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem;
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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public abstract class InvestBaseFilterItem {
    private boolean selected;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jtB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return InvestBaseFilterItem._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestBaseFilterItem() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public abstract String getIcon();

    public abstract String getName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) InvestBaseFilterItem.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InvestBaseFilterItem> serializer() {
            return EZpvd();
        }
    }

    public /* synthetic */ InvestBaseFilterItem(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.selected = false;
        } else {
            this.selected = z;
        }
    }

    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(InvestBaseFilterItem.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(InvestBaseFilterItem investBaseFilterItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investBaseFilterItem.selected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, investBaseFilterItem.selected);
        }
    }

    public InvestBaseFilterItem(boolean z) {
        this.selected = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:6) call: com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem.<init>(boolean):void type: THIS */
    public /* synthetic */ InvestBaseFilterItem(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
