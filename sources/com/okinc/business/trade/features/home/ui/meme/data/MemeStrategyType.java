package com.okinc.business.trade.features.home.ui.meme.data;

import androidx.fragment.app.Fragment;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C30918lkH;
import o.C30925lkO;
import o.C56444yFp;
import o.InterfaceC30916lkF;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeStrategyType implements InterfaceC30916lkF {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeStrategyType[] $VALUES;
    public static final MemeStrategyType BuyNow;
    public static final StateListAnimator Companion;
    public static final MemeStrategyType SellNow;
    private final String contentDesc;
    private final InterfaceC30916lkF provider;
    private final int strategyType;
    private final int title;
    private final TransactionType transactionType;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeStrategyType[] $values() {
        return new MemeStrategyType[]{BuyNow, SellNow};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeStrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentDesc() {
        return this.contentDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private MemeStrategyType(String str, int i, TransactionType transactionType, int i2, InterfaceC30916lkF interfaceC30916lkF, int i3, int i4, String str2) {
        this.transactionType = transactionType;
        this.title = i2;
        this.provider = interfaceC30916lkF;
        this.type = i3;
        this.strategyType = i4;
        this.contentDesc = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 int)
  (r13v0 com.okinc.business.dexlogic.bean.TransactionType)
  (r14v0 int)
  (r15v0 o.lkF)
  (r16v0 int)
  (r17v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
 A[MD:(java.lang.String, int, com.okinc.business.dexlogic.bean.TransactionType, int, o.lkF, int, int, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType.<init>(java.lang.String, int, com.okinc.business.dexlogic.bean.TransactionType, int, o.lkF, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ MemeStrategyType(String str, int i, TransactionType transactionType, int i2, InterfaceC30916lkF interfaceC30916lkF, int i3, int i4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, transactionType, i2, interfaceC30916lkF, i3, i4, (i5 & 32) != 0 ? null : str2);
    }

    static {
        TransactionType transactionType = TransactionType.Buy;
        int i = C23274hvD.Fragment.getSessionToken;
        C30918lkH c30918lkH = new InterfaceC30916lkF() { // from class: o.lkH
            @Override // o.InterfaceC30916lkF
            public androidx.fragment.app.Fragment obtainFragment(@NotNull C30925lkO c30925lkO) {
                Intrinsics.checkNotNullParameter(c30925lkO, "");
                return MemeMarketStrategyV6Fragment.Companion.KWHzl(c30925lkO.copydefault(), c30925lkO.AEQbTJ(), c30925lkO.KWHzl(), c30925lkO.OLrzqt(), c30925lkO.EZpvd());
            }
        };
        int i2 = 1;
        BuyNow = new MemeStrategyType("BuyNow", 0, transactionType, i, c30918lkH, 0, i2, null, 32, null);
        SellNow = new MemeStrategyType("SellNow", i2, TransactionType.Sell, C23274hvD.Fragment.getNotifyChildrenChangedOptions, c30918lkH, 2, 1, null, 32, null);
        MemeStrategyType[] memeStrategyTypeArr$values = $values();
        $VALUES = memeStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeStrategyTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {

        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TransactionType.values().length];
                try {
                    iArr[TransactionType.Buy.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransactionType.Sell.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final MemeStrategyType copydefault(@NotNull TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            int i = Application.OLrzqt[transactionType.ordinal()];
            if (i == 1) {
                return MemeStrategyType.BuyNow;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return MemeStrategyType.SellNow;
        }

        public final List<MemeStrategyType> OLrzqt(@NotNull TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            MemeStrategyType[] memeStrategyTypeArrValues = MemeStrategyType.values();
            ArrayList arrayList = new ArrayList();
            for (MemeStrategyType memeStrategyType : memeStrategyTypeArrValues) {
                if (memeStrategyType.transactionType == transactionType) {
                    arrayList.add(memeStrategyType);
                }
            }
            return arrayList;
        }
    }

    @Override // o.InterfaceC30916lkF
    public Fragment obtainFragment(@NotNull C30925lkO c30925lkO) {
        Intrinsics.checkNotNullParameter(c30925lkO, "");
        return this.provider.obtainFragment(c30925lkO);
    }

    public static MemeStrategyType valueOf(String str) {
        return (MemeStrategyType) Enum.valueOf(MemeStrategyType.class, str);
    }

    public static MemeStrategyType[] values() {
        return (MemeStrategyType[]) $VALUES.clone();
    }
}
