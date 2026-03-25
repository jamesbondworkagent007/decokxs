package o;

import com.okinc.market.discover.features.filter.data.model.GroupRequest;
import com.okinc.market.discover.features.filter.data.model.TokenGroupPo;
import com.okinc.market.discover.features.filter.data.model.TokenGroupVo;
import com.okinc.market.discover.features.filter.domian.usecase.GetTokenGroupUseCase$onExecute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38434pYq extends AbstractC49400uno<GroupRequest, java.util.List<? extends TokenGroupVo>> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.util.List<TokenGroupVo> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C38430pYm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((GroupRequest) obj, (Continuation<? super java.util.List<TokenGroupVo>>) continuation);
    }

    @yCM
    public C38434pYq(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C38430pYm c38430pYm) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c38430pYm, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c38430pYm;
    }

    /* JADX INFO: renamed from: o.pYq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pYq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.Object KWHzl(@NotNull GroupRequest groupRequest, @NotNull Continuation<? super java.util.List<TokenGroupVo>> continuation) {
        return BuildersKt.withContext(AEQbTJ(), new GetTokenGroupUseCase$onExecute$2(groupRequest, this, null), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [78=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String AEQbTJ(java.lang.String str) {
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return C33070mpX.AYXKKw(qZH.PendingIntent.aeJQwa);
                }
                return "";
            case 50:
                if (str.equals("2")) {
                    return C33070mpX.AYXKKw(qZH.PendingIntent.clearRegistrations);
                }
                return "";
            case 51:
                if (str.equals("3")) {
                    return C33070mpX.AYXKKw(qZH.PendingIntent.finishInit);
                }
                return "";
            case 52:
                if (str.equals("4")) {
                    return C33070mpX.AYXKKw(qZH.PendingIntent.v);
                }
                return "";
            case 53:
                if (str.equals("5")) {
                    return C33070mpX.AYXKKw(qZH.PendingIntent.FQNKFG);
                }
                return "";
            default:
                return "";
        }
    }

    public final java.util.List<TokenGroupVo> AEQbTJ(java.util.List<TokenGroupPo> list, java.util.List<java.lang.String> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TokenGroupPo tokenGroupPo : list) {
            int total = tokenGroupPo.getTotal() - tokenGroupPo.getCoinList().size();
            java.lang.String groupType = tokenGroupPo.getGroupType();
            java.lang.String strAEQbTJ = AEQbTJ(tokenGroupPo.getGroupType());
            java.util.List<TokenGroupPo.Coin> coinList = tokenGroupPo.getCoinList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(coinList, 10));
            java.util.Iterator<T> it = coinList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TokenGroupPo.Coin) it.next()).getIcon());
            }
            arrayList.add(new TokenGroupVo(groupType, strAEQbTJ, arrayList2, total > 0 ? Marker.ANY_NON_NULL_MARKER + xMR.copydefault.copydefault(java.lang.String.valueOf(total)) : "", list2.contains(tokenGroupPo.getGroupType()), Intrinsics.EZpvd((java.lang.Object) tokenGroupPo.getGroupType(), (java.lang.Object) "5") && (tokenGroupPo.getCoinList().isEmpty() ^ true)));
        }
        return arrayList;
    }
}
