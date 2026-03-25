package com.okinc.unify_trade.biz.subscribe;

import com.okinc.dex.TPSLItemData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class DexOrderDetailItem {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.DexOrderDetailItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DexOrderDetailItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DexOrderDetailItem() {
    }

    public static final class HeaderInfo extends DexOrderDetailItem {
        public static final int $stable = 0;
        private final Function0<Unit> onTradeClick;
        private final String tokenName;
        private final String tradeSide;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.DexOrderDetailItem$HeaderInfo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HeaderInfo copy$default(HeaderInfo headerInfo, String str, String str2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = headerInfo.tokenName;
            }
            if ((i & 2) != 0) {
                str2 = headerInfo.tradeSide;
            }
            if ((i & 4) != 0) {
                function0 = headerInfo.onTradeClick;
            }
            return headerInfo.copy(str, str2, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tradeSide;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component3() {
            return this.onTradeClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HeaderInfo copy(@NotNull String str, String str2, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            return new HeaderInfo(str, str2, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderInfo)) {
                return false;
            }
            HeaderInfo headerInfo = (HeaderInfo) obj;
            return Intrinsics.EZpvd((Object) this.tokenName, (Object) headerInfo.tokenName) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) headerInfo.tradeSide) && Intrinsics.EZpvd(this.onTradeClick, headerInfo.onTradeClick);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> getOnTradeClick() {
            return this.onTradeClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenName() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTradeSide() {
            return this.tradeSide;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.tokenName.hashCode();
            String str = this.tradeSide;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Function0<Unit> function0 = this.onTradeClick;
            return (((iHashCode * 31) + iHashCode2) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HeaderInfo(tokenName=" + this.tokenName + ", tradeSide=" + this.tradeSide + ", onTradeClick=" + this.onTradeClick + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:112) call: com.okinc.unify_trade.biz.subscribe.DexOrderDetailItem.HeaderInfo.<init>(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ HeaderInfo(String str, String str2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : function0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderInfo(@NotNull String str, String str2, Function0<Unit> function0) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.tokenName = str;
            this.tradeSide = str2;
            this.onTradeClick = function0;
        }
    }

    public static final class DetailRow extends DexOrderDetailItem {
        public static final int $stable = 0;
        private final Function0<Unit> onTitleClick;
        private final Function0<Unit> onValueClick;
        private final Function0<CharSequence> title;
        private final int titleHyperType;
        private final Function0<CharSequence> value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.subscribe.DexOrderDetailItem$DetailRow */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function0 = detailRow.title;
            }
            if ((i2 & 2) != 0) {
                function02 = detailRow.value;
            }
            Function0 function05 = function02;
            if ((i2 & 4) != 0) {
                function03 = detailRow.onTitleClick;
            }
            Function0 function06 = function03;
            if ((i2 & 8) != 0) {
                function04 = detailRow.onValueClick;
            }
            Function0 function07 = function04;
            if ((i2 & 16) != 0) {
                i = detailRow.titleHyperType;
            }
            return detailRow.copy(function0, function05, function06, function07, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<CharSequence> component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<CharSequence> component2() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component3() {
            return this.onTitleClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component4() {
            return this.onValueClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.titleHyperType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DetailRow copy(@NotNull Function0<? extends CharSequence> function0, @NotNull Function0<? extends CharSequence> function02, Function0<Unit> function03, Function0<Unit> function04, int i) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            return new DetailRow(function0, function02, function03, function04, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) obj;
            return Intrinsics.EZpvd(this.title, detailRow.title) && Intrinsics.EZpvd(this.value, detailRow.value) && Intrinsics.EZpvd(this.onTitleClick, detailRow.onTitleClick) && Intrinsics.EZpvd(this.onValueClick, detailRow.onValueClick) && this.titleHyperType == detailRow.titleHyperType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> getOnTitleClick() {
            return this.onTitleClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> getOnValueClick() {
            return this.onValueClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<CharSequence> getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitleHyperType() {
            return this.titleHyperType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<CharSequence> getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.title.hashCode();
            int iHashCode2 = this.value.hashCode();
            Function0<Unit> function0 = this.onTitleClick;
            int iHashCode3 = function0 == null ? 0 : function0.hashCode();
            Function0<Unit> function02 = this.onValueClick;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function02 != null ? function02.hashCode() : 0)) * 31) + Integer.hashCode(this.titleHyperType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DetailRow(title=" + this.title + ", value=" + this.value + ", onTitleClick=" + this.onTitleClick + ", onValueClick=" + this.onValueClick + ", titleHyperType=" + this.titleHyperType + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r8v0 kotlin.jvm.functions.Function0)
  (r9v0 kotlin.jvm.functions.Function0)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r10v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r11v0 kotlin.jvm.functions.Function0))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r12v0 int))
 A[MD:(kotlin.jvm.functions.Function0<? extends java.lang.CharSequence>, kotlin.jvm.functions.Function0<? extends java.lang.CharSequence>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int):void (m)] (LINE:119) call: com.okinc.unify_trade.biz.subscribe.DexOrderDetailItem.DetailRow.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int):void type: THIS */
        public /* synthetic */ DetailRow(Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, function02, (i2 & 4) != 0 ? null : function03, (i2 & 8) != 0 ? null : function04, (i2 & 16) != 0 ? 2 : i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends java.lang.CharSequence> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends java.lang.CharSequence> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DetailRow(@NotNull Function0<? extends CharSequence> function0, @NotNull Function0<? extends CharSequence> function02, Function0<Unit> function03, Function0<Unit> function04, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            this.title = function0;
            this.value = function02;
            this.onTitleClick = function03;
            this.onValueClick = function04;
            this.titleHyperType = i;
        }
    }

    public static final class Divider extends DexOrderDetailItem {
        public static final int $stable = 0;
        public static final Divider INSTANCE = new Divider();

        private Divider() {
            super(null);
        }
    }

    public static final class TPSLHeader extends DexOrderDetailItem {
        public static final int $stable = 0;
        private final String text;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TPSLHeader copy$default(TPSLHeader tPSLHeader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tPSLHeader.text;
            }
            return tPSLHeader.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TPSLHeader copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TPSLHeader(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TPSLHeader) && Intrinsics.EZpvd((Object) this.text, (Object) ((TPSLHeader) obj).text);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.text.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TPSLHeader(text=" + this.text + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TPSLHeader(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }
    }

    public static final class TPSLData extends DexOrderDetailItem {
        public static final int $stable = 8;
        private final List<TPSLItemData> tpslData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.DexOrderDetailItem$TPSLData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TPSLData copy$default(TPSLData tPSLData, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tPSLData.tpslData;
            }
            return tPSLData.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TPSLItemData> component1() {
            return this.tpslData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TPSLData copy(@NotNull List<TPSLItemData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TPSLData(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TPSLData) && Intrinsics.EZpvd(this.tpslData, ((TPSLData) obj).tpslData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TPSLItemData> getTpslData() {
            return this.tpslData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.tpslData.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TPSLData(tpslData=" + this.tpslData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TPSLData(@NotNull List<TPSLItemData> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.tpslData = list;
        }
    }
}
