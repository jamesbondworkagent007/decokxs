package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ConceptHot {
    private String changPerAvg;
    private String code;
    private String maxCcy;
    private String maxCcyChangPer;
    private String nameCn;
    private String nameEn;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangPerAvg() {
        return this.changPerAvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCcy() {
        return this.maxCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCcyChangPer() {
        return this.maxCcyChangPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNameCn() {
        return this.nameCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNameEn() {
        return this.nameEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangPerAvg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changPerAvg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCcyChangPer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxCcyChangPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNameCn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nameCn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNameEn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nameEn = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ConceptHot.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConceptHot> serializer() {
            return ConceptHot$$serializer.INSTANCE;
        }
    }

    public ConceptHot() {
        this.code = "";
        this.nameCn = "";
        this.nameEn = "";
        this.changPerAvg = "";
        this.maxCcy = "";
        this.maxCcyChangPer = "";
    }

    public /* synthetic */ ConceptHot(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.nameCn = "";
        } else {
            this.nameCn = str2;
        }
        if ((i & 4) == 0) {
            this.nameEn = "";
        } else {
            this.nameEn = str3;
        }
        if ((i & 8) == 0) {
            this.changPerAvg = "";
        } else {
            this.changPerAvg = str4;
        }
        if ((i & 16) == 0) {
            this.maxCcy = "";
        } else {
            this.maxCcy = str5;
        }
        if ((i & 32) == 0) {
            this.maxCcyChangPer = "";
        } else {
            this.maxCcyChangPer = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ConceptHot conceptHot, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) conceptHot.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, conceptHot.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) conceptHot.nameCn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, conceptHot.nameCn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) conceptHot.nameEn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, conceptHot.nameEn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) conceptHot.changPerAvg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, conceptHot.changPerAvg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) conceptHot.maxCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, conceptHot.maxCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) conceptHot.maxCcyChangPer, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, conceptHot.maxCcyChangPer);
    }
}
