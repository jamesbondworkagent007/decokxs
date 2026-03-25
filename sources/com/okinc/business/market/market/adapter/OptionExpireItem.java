package com.okinc.business.market.market.adapter;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class OptionExpireItem {
    private boolean isSelect;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OptionExpireItem copy$default(OptionExpireItem optionExpireItem, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionExpireItem.text;
        }
        if ((i & 2) != 0) {
            z = optionExpireItem.isSelect;
        }
        return optionExpireItem.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionExpireItem copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OptionExpireItem(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionExpireItem)) {
            return false;
        }
        OptionExpireItem optionExpireItem = (OptionExpireItem) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) optionExpireItem.text) && this.isSelect == optionExpireItem.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.text.hashCode() * 31) + Boolean.hashCode(this.isSelect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionExpireItem(text=" + this.text + ", isSelect=" + this.isSelect + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.market.adapter.OptionExpireItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionExpireItem> serializer() {
            return OptionExpireItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionExpireItem(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OptionExpireItem$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.isSelect = false;
        } else {
            this.isSelect = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(OptionExpireItem optionExpireItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, optionExpireItem.text);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || optionExpireItem.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, optionExpireItem.isSelect);
        }
    }

    public OptionExpireItem(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
        this.isSelect = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:72) call: com.okinc.business.market.market.adapter.OptionExpireItem.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ OptionExpireItem(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
