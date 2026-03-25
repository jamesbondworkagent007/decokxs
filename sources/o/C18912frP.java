package o;

import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.dapp.bean.DappSearchResultBean;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18912frP extends AbstractC43215rlA implements xWR {
    public final C18943fru OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C18912frP(@NotNull C18943fru c18943fru) {
        Intrinsics.checkNotNullParameter(c18943fru, "");
        this.OLrzqt = c18943fru;
    }

    /* JADX INFO: renamed from: o.frP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.frP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.xWR
    public AbstractC58260yxt<java.util.List<C54827xWu>> KWHzl() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.frU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C18912frP.AEQbTJ(this.KWHzl);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.frV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18912frP.copydefault((java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<java.util.List<C54827xWu>> abstractC58260yxtEZpvd = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58227yxM() { // from class: o.frY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18912frP.OLrzqt(function1, obj);
            }
        }).EZpvd(yDY.AhwBna());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtEZpvd, "");
        return abstractC58260yxtEZpvd;
    }

    public static final java.util.List AEQbTJ(C18912frP c18912frP) {
        java.util.List<SearchHistoryItem> listAEQbTJ = c18912frP.OLrzqt.AEQbTJ();
        java.util.ArrayList<DAppSearchHistory> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAEQbTJ) {
            if (obj instanceof DAppSearchHistory) {
                arrayList.add(obj);
            }
        }
        pUU.EZpvd("WalletSearchHistoryServiceImpl", "Retrieved " + arrayList.size() + " DApp items from SharedPreferences");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (DAppSearchHistory dAppSearchHistory : arrayList) {
            arrayList2.add(new C54827xWu(dAppSearchHistory.OLrzqt(), dAppSearchHistory.copydefault(), dAppSearchHistory.djBIcL(), dAppSearchHistory.AEQbTJ(), dAppSearchHistory.AhwBna()));
        }
        return arrayList2;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        pUU.AEQbTJ("WalletSearchHistoryServiceImpl", "Failed to get DApp search history: " + th.getMessage(), th);
        return Unit.INSTANCE;
    }

    @Override // o.xWR
    public void OLrzqt(@NotNull java.util.List<C54827xWu> list, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        xWA xwa;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C54827xWu c54827xWu : list) {
                java.lang.String strAEQbTJ = c54827xWu.AEQbTJ();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(c54827xWu.KWHzl()));
                java.lang.String strCopydefault = c54827xWu.copydefault();
                arrayList.add(new DappSearchResultBean("", 1, strAEQbTJ, strGEmmrt, strCopydefault == null ? "" : strCopydefault, "", "", c54827xWu.OLrzqt(), "", false, (java.util.List) null, c54827xWu.EZpvd(), 1536, (DefaultConstructorMarker) null));
            }
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
            if (listKWHzl != null && (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) != null) {
                xwa.AEQbTJ(arrayList, function1);
            } else {
                pUU.valueOf("WalletSearchHistoryServiceImpl", "OKWalletDiscoverExtension not found");
                function1.invoke(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("WalletSearchHistoryServiceImpl", "Failed to update DApp search history timestamp: " + e.getMessage(), e);
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }
}
