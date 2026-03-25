package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class CategoryModuleData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int categoryType;
    public final int dataId;
    public final String moduleName;
    public final String moduleNameMultiLanguageText;
    public final String tagKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CategoryModuleData() {
        this(0, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CategoryModuleData copy$default(CategoryModuleData categoryModuleData, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = categoryModuleData.categoryType;
        }
        if ((i3 & 2) != 0) {
            i2 = categoryModuleData.dataId;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = categoryModuleData.moduleName;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = categoryModuleData.moduleNameMultiLanguageText;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = categoryModuleData.tagKey;
        }
        return categoryModuleData.EZpvd(i, i4, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryModuleData EZpvd(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CategoryModuleData(i, i2, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.tagKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.moduleNameMultiLanguageText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryModuleData)) {
            return false;
        }
        CategoryModuleData categoryModuleData = (CategoryModuleData) obj;
        return this.categoryType == categoryModuleData.categoryType && this.dataId == categoryModuleData.dataId && Intrinsics.EZpvd((Object) this.moduleName, (Object) categoryModuleData.moduleName) && Intrinsics.EZpvd((Object) this.moduleNameMultiLanguageText, (Object) categoryModuleData.moduleNameMultiLanguageText) && Intrinsics.EZpvd((Object) this.tagKey, (Object) categoryModuleData.tagKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.categoryType) * 31) + Integer.hashCode(this.dataId)) * 31) + this.moduleName.hashCode()) * 31) + this.moduleNameMultiLanguageText.hashCode()) * 31) + this.tagKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CategoryModuleData(categoryType=" + this.categoryType + ", dataId=" + this.dataId + ", moduleName=" + this.moduleName + ", moduleNameMultiLanguageText=" + this.moduleNameMultiLanguageText + ", tagKey=" + this.tagKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.CategoryModuleData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CategoryModuleData> serializer() {
            return CategoryModuleData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CategoryModuleData(int i, int i2, int i3, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.categoryType = 0;
        } else {
            this.categoryType = i2;
        }
        if ((i & 2) == 0) {
            this.dataId = 0;
        } else {
            this.dataId = i3;
        }
        if ((i & 4) == 0) {
            this.moduleName = "";
        } else {
            this.moduleName = str;
        }
        if ((i & 8) == 0) {
            this.moduleNameMultiLanguageText = "";
        } else {
            this.moduleNameMultiLanguageText = str2;
        }
        if ((i & 16) == 0) {
            this.tagKey = "";
        } else {
            this.tagKey = str3;
        }
    }

    public static final /* synthetic */ void copydefault(CategoryModuleData categoryModuleData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || categoryModuleData.categoryType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, categoryModuleData.categoryType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || categoryModuleData.dataId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, categoryModuleData.dataId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) categoryModuleData.moduleName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, categoryModuleData.moduleName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) categoryModuleData.moduleNameMultiLanguageText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, categoryModuleData.moduleNameMultiLanguageText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) categoryModuleData.tagKey, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, categoryModuleData.tagKey);
    }

    public CategoryModuleData(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.categoryType = i;
        this.dataId = i2;
        this.moduleName = str;
        this.moduleNameMultiLanguageText = str2;
        this.tagKey = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(int, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.business.market.data.model.CategoryModuleData.<init>(int, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CategoryModuleData(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3);
    }
}
