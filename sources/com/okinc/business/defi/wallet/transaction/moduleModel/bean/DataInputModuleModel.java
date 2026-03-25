package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DataInputModuleModel extends BaseModel<DataInputItem> {
    public static final int $stable = 0;

    public DataInputModuleModel() {
        super("dataInput");
    }

    public static final class DataInputItem {
        public static final String HEIGHT_NORMAL = "normal";
        public static final String HEIGHT_TALL = "tall";
        public static final String INPUT_TYPE_NUMBER = "number";
        public static final String INPUT_TYPE_TEXT = "text";
        private String content;
        private final String height;
        private final String hint;
        private final String inputType;
        private final int maxByteLength;
        private final int maxDecimalLength;
        private final Function1<String, Unit> onContentChange;
        private final String title;
        public static final ActionBar Companion = new ActionBar(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.height;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.hint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.inputType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component6() {
            return this.maxByteLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component7() {
            return this.maxDecimalLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<String, Unit> component8() {
            return this.onContentChange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DataInputItem copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, int i2, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new DataInputItem(str, str2, str3, str4, str5, i, i2, function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataInputItem)) {
                return false;
            }
            DataInputItem dataInputItem = (DataInputItem) obj;
            return Intrinsics.EZpvd((Object) this.height, (Object) dataInputItem.height) && Intrinsics.EZpvd((Object) this.title, (Object) dataInputItem.title) && Intrinsics.EZpvd((Object) this.hint, (Object) dataInputItem.hint) && Intrinsics.EZpvd((Object) this.content, (Object) dataInputItem.content) && Intrinsics.EZpvd((Object) this.inputType, (Object) dataInputItem.inputType) && this.maxByteLength == dataInputItem.maxByteLength && this.maxDecimalLength == dataInputItem.maxDecimalLength && Intrinsics.EZpvd(this.onContentChange, dataInputItem.onContentChange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContent() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHeight() {
            return this.height;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHint() {
            return this.hint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInputType() {
            return this.inputType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getMaxByteLength() {
            return this.maxByteLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getMaxDecimalLength() {
            return this.maxDecimalLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<String, Unit> getOnContentChange() {
            return this.onContentChange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.height.hashCode();
            int iHashCode2 = this.title.hashCode();
            String str = this.hint;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.content;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            int iHashCode5 = this.inputType.hashCode();
            int iHashCode6 = Integer.hashCode(this.maxByteLength);
            int iHashCode7 = Integer.hashCode(this.maxDecimalLength);
            Function1<String, Unit> function1 = this.onContentChange;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (function1 != null ? function1.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContent(String str) {
            this.content = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DataInputItem(height=" + this.height + ", title=" + this.title + ", hint=" + this.hint + ", content=" + this.content + ", inputType=" + this.inputType + ", maxByteLength=" + this.maxByteLength + ", maxDecimalLength=" + this.maxDecimalLength + ", onContentChange=" + this.onContentChange + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public DataInputItem(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, int i2, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.height = str;
            this.title = str2;
            this.hint = str3;
            this.content = str4;
            this.inputType = str5;
            this.maxByteLength = i;
            this.maxDecimalLength = i2;
            this.onContentChange = function1;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 int)
  (r17v0 int)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r18v0 kotlin.jvm.functions.Function1))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:515) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel.DataInputItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.functions.Function1):void type: THIS */
        public /* synthetic */ DataInputItem(String str, String str2, String str3, String str4, String str5, int i, int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, i, i2, (i3 & 128) != 0 ? null : function1);
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel.DataInputItem.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }
    }
}
