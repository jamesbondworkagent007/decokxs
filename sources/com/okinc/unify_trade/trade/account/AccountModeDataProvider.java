package com.okinc.unify_trade.trade.account;

import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes24.dex */
public final class AccountModeDataProvider {
    public TradeRightContentData AEQbTJ;
    public String AYXKKw;
    public TradeRightContentData AhwBna;
    public final ArrayList<Object> AkhnZx;
    public final ArrayList<Object> DbNXlk;
    public final ArrayList<AccountTypeData> EZpvd;
    public TradeRightContentData KWHzl;
    public TradeRightContentData OLrzqt;
    public TradeRightContentData copydefault;
    public TradeRightContentData djBIcL;
    public final ArrayList<Object> fetchVPNInfo;
    public TradeRightContentData gEmmrt;
    public final ArrayList<Object> isConnected;
    public TradeRightContentData valueOf;

    public AccountModeDataProvider() {
        RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE").subscribe(new RxBus.EventCallback<String>() { // from class: com.okinc.unify_trade.trade.account.AccountModeDataProvider.1
            {
                super(AccountModeDataProvider.this);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                AccountModeDataProvider.this.EZpvd();
            }
        });
        this.AYXKKw = "";
        this.copydefault = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.valueOf = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.AEQbTJ = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.OLrzqt = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.KWHzl = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.gEmmrt = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.djBIcL = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.AhwBna = new TradeRightContentData("", true, false, null, false, false, 60, null);
        this.EZpvd = new ArrayList<>();
        this.fetchVPNInfo = new ArrayList<>();
        this.DbNXlk = new ArrayList<>();
        this.isConnected = new ArrayList<>();
        this.AkhnZx = new ArrayList<>();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final TaskDescription Companion;
        public static final String PNL_OFFSET = "pnl_offset";
        public static final String RISK_UNIT_OFFSET = "risk_unit_offset";
        public static final Mode TradingAccount = new Mode("TradingAccount", 0);
        public static final Mode SingleCurrency = new Mode("SingleCurrency", 1);
        public static final Mode MultipleCurrency = new Mode("MultipleCurrency", 2);
        public static final Mode PortfolioMargin = new Mode("PortfolioMargin", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{TradingAccount, SingleCurrency, MultipleCurrency, PortfolioMargin};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.trade.account.AccountModeDataProvider.Mode.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
            Companion = new TaskDescription(null);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public final void EZpvd() {
        this.fetchVPNInfo.clear();
        this.isConnected.clear();
        this.DbNXlk.clear();
        this.AkhnZx.clear();
        this.EZpvd.clear();
    }
}
