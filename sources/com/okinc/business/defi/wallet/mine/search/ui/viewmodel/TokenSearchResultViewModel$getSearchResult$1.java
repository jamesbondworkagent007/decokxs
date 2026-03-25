package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.biz.net.bean.WalletSearchResp;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppModel;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchTokenModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchExtraInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C18902frF;
import o.C18913frQ;
import o.C18914frR;
import o.C18977fsb;
import o.C18980fse;
import o.C18982fsg;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultViewModel$getSearchResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needSearch;
    final /* synthetic */ String $searchKeyword;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ TokenSearchResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultViewModel$getSearchResult$1(TokenSearchResultViewModel tokenSearchResultViewModel, String str, boolean z, Continuation<? super TokenSearchResultViewModel$getSearchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenSearchResultViewModel;
        this.$searchKeyword = str;
        this.$needSearch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenSearchResultViewModel$getSearchResult$1 tokenSearchResultViewModel$getSearchResult$1 = new TokenSearchResultViewModel$getSearchResult$1(this.this$0, this.$searchKeyword, this.$needSearch, continuation);
        tokenSearchResultViewModel$getSearchResult$1.L$0 = obj;
        return tokenSearchResultViewModel$getSearchResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenSearchResultViewModel$getSearchResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0271 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e2 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:9:0x0031, B:103:0x0275, B:150:0x037e, B:12:0x0040, B:89:0x0216, B:91:0x0220, B:95:0x0231, B:97:0x0235, B:99:0x023b, B:13:0x0048, B:18:0x0058, B:147:0x036b, B:21:0x006d, B:113:0x02bc, B:117:0x02c5, B:118:0x02cb, B:120:0x02e2, B:121:0x02f1, B:123:0x02f7, B:127:0x0311, B:130:0x031c, B:132:0x0322, B:137:0x0330, B:139:0x0336, B:144:0x0341, B:134:0x0328, B:24:0x0086, B:59:0x01b4, B:62:0x01c0, B:64:0x01c6, B:67:0x01ce, B:69:0x01d4, B:72:0x01dc, B:74:0x01e2, B:77:0x01ea, B:79:0x01f0, B:83:0x01fa, B:85:0x0200, B:107:0x029f, B:109:0x02a5, B:27:0x00a0, B:55:0x0193, B:30:0x00ba, B:44:0x013e, B:46:0x0142, B:47:0x0146, B:51:0x0156, B:33:0x00d2, B:40:0x0125, B:36:0x00e5), top: B:163:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0311 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:9:0x0031, B:103:0x0275, B:150:0x037e, B:12:0x0040, B:89:0x0216, B:91:0x0220, B:95:0x0231, B:97:0x0235, B:99:0x023b, B:13:0x0048, B:18:0x0058, B:147:0x036b, B:21:0x006d, B:113:0x02bc, B:117:0x02c5, B:118:0x02cb, B:120:0x02e2, B:121:0x02f1, B:123:0x02f7, B:127:0x0311, B:130:0x031c, B:132:0x0322, B:137:0x0330, B:139:0x0336, B:144:0x0341, B:134:0x0328, B:24:0x0086, B:59:0x01b4, B:62:0x01c0, B:64:0x01c6, B:67:0x01ce, B:69:0x01d4, B:72:0x01dc, B:74:0x01e2, B:77:0x01ea, B:79:0x01f0, B:83:0x01fa, B:85:0x0200, B:107:0x029f, B:109:0x02a5, B:27:0x00a0, B:55:0x0193, B:30:0x00ba, B:44:0x013e, B:46:0x0142, B:47:0x0146, B:51:0x0156, B:33:0x00d2, B:40:0x0125, B:36:0x00e5), top: B:163:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031c A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:9:0x0031, B:103:0x0275, B:150:0x037e, B:12:0x0040, B:89:0x0216, B:91:0x0220, B:95:0x0231, B:97:0x0235, B:99:0x023b, B:13:0x0048, B:18:0x0058, B:147:0x036b, B:21:0x006d, B:113:0x02bc, B:117:0x02c5, B:118:0x02cb, B:120:0x02e2, B:121:0x02f1, B:123:0x02f7, B:127:0x0311, B:130:0x031c, B:132:0x0322, B:137:0x0330, B:139:0x0336, B:144:0x0341, B:134:0x0328, B:24:0x0086, B:59:0x01b4, B:62:0x01c0, B:64:0x01c6, B:67:0x01ce, B:69:0x01d4, B:72:0x01dc, B:74:0x01e2, B:77:0x01ea, B:79:0x01f0, B:83:0x01fa, B:85:0x0200, B:107:0x029f, B:109:0x02a5, B:27:0x00a0, B:55:0x0193, B:30:0x00ba, B:44:0x013e, B:46:0x0142, B:47:0x0146, B:51:0x0156, B:33:0x00d2, B:40:0x0125, B:36:0x00e5), top: B:163:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0328 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:9:0x0031, B:103:0x0275, B:150:0x037e, B:12:0x0040, B:89:0x0216, B:91:0x0220, B:95:0x0231, B:97:0x0235, B:99:0x023b, B:13:0x0048, B:18:0x0058, B:147:0x036b, B:21:0x006d, B:113:0x02bc, B:117:0x02c5, B:118:0x02cb, B:120:0x02e2, B:121:0x02f1, B:123:0x02f7, B:127:0x0311, B:130:0x031c, B:132:0x0322, B:137:0x0330, B:139:0x0336, B:144:0x0341, B:134:0x0328, B:24:0x0086, B:59:0x01b4, B:62:0x01c0, B:64:0x01c6, B:67:0x01ce, B:69:0x01d4, B:72:0x01dc, B:74:0x01e2, B:77:0x01ea, B:79:0x01f0, B:83:0x01fa, B:85:0x0200, B:107:0x029f, B:109:0x02a5, B:27:0x00a0, B:55:0x0193, B:30:0x00ba, B:44:0x013e, B:46:0x0142, B:47:0x0146, B:51:0x0156, B:33:0x00d2, B:40:0x0125, B:36:0x00e5), top: B:163:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:9:0x0031, B:103:0x0275, B:150:0x037e, B:12:0x0040, B:89:0x0216, B:91:0x0220, B:95:0x0231, B:97:0x0235, B:99:0x023b, B:13:0x0048, B:18:0x0058, B:147:0x036b, B:21:0x006d, B:113:0x02bc, B:117:0x02c5, B:118:0x02cb, B:120:0x02e2, B:121:0x02f1, B:123:0x02f7, B:127:0x0311, B:130:0x031c, B:132:0x0322, B:137:0x0330, B:139:0x0336, B:144:0x0341, B:134:0x0328, B:24:0x0086, B:59:0x01b4, B:62:0x01c0, B:64:0x01c6, B:67:0x01ce, B:69:0x01d4, B:72:0x01dc, B:74:0x01e2, B:77:0x01ea, B:79:0x01f0, B:83:0x01fa, B:85:0x0200, B:107:0x029f, B:109:0x02a5, B:27:0x00a0, B:55:0x0193, B:30:0x00ba, B:44:0x013e, B:46:0x0142, B:47:0x0146, B:51:0x0156, B:33:0x00d2, B:40:0x0125, B:36:0x00e5), top: B:163:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0220 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:9:0x0031, B:103:0x0275, B:150:0x037e, B:12:0x0040, B:89:0x0216, B:91:0x0220, B:95:0x0231, B:97:0x0235, B:99:0x023b, B:13:0x0048, B:18:0x0058, B:147:0x036b, B:21:0x006d, B:113:0x02bc, B:117:0x02c5, B:118:0x02cb, B:120:0x02e2, B:121:0x02f1, B:123:0x02f7, B:127:0x0311, B:130:0x031c, B:132:0x0322, B:137:0x0330, B:139:0x0336, B:144:0x0341, B:134:0x0328, B:24:0x0086, B:59:0x01b4, B:62:0x01c0, B:64:0x01c6, B:67:0x01ce, B:69:0x01d4, B:72:0x01dc, B:74:0x01e2, B:77:0x01ea, B:79:0x01f0, B:83:0x01fa, B:85:0x0200, B:107:0x029f, B:109:0x02a5, B:27:0x00a0, B:55:0x0193, B:30:0x00ba, B:44:0x013e, B:46:0x0142, B:47:0x0146, B:51:0x0156, B:33:0x00d2, B:40:0x0125, B:36:0x00e5), top: B:163:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:9:0x0031, B:103:0x0275, B:150:0x037e, B:12:0x0040, B:89:0x0216, B:91:0x0220, B:95:0x0231, B:97:0x0235, B:99:0x023b, B:13:0x0048, B:18:0x0058, B:147:0x036b, B:21:0x006d, B:113:0x02bc, B:117:0x02c5, B:118:0x02cb, B:120:0x02e2, B:121:0x02f1, B:123:0x02f7, B:127:0x0311, B:130:0x031c, B:132:0x0322, B:137:0x0330, B:139:0x0336, B:144:0x0341, B:134:0x0328, B:24:0x0086, B:59:0x01b4, B:62:0x01c0, B:64:0x01c6, B:67:0x01ce, B:69:0x01d4, B:72:0x01dc, B:74:0x01e2, B:77:0x01ea, B:79:0x01f0, B:83:0x01fa, B:85:0x0200, B:107:0x029f, B:109:0x02a5, B:27:0x00a0, B:55:0x0193, B:30:0x00ba, B:44:0x013e, B:46:0x0142, B:47:0x0146, B:51:0x0156, B:33:0x00d2, B:40:0x0125, B:36:0x00e5), top: B:163:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        TokenSearchResultViewModel tokenSearchResultViewModel;
        MutableSharedFlow mutableSharedFlow;
        C18980fse c18980fse;
        TokenSearchResultViewModel tokenSearchResultViewModel2;
        String str;
        CoroutineScope coroutineScope;
        boolean z;
        Object objEZpvd;
        TokenSearchResultViewModel tokenSearchResultViewModel3;
        List listAhwBna;
        Object objAwait;
        TokenSearchResultViewModel tokenSearchResultViewModel4;
        boolean z2;
        int i;
        Deferred deferred;
        String str2;
        Object objAwait2;
        boolean z3;
        WalletSearchResponse walletSearchResponse;
        List list;
        List<SearchTokenModel> tokens;
        Object objKWHzl;
        TokenSearchResultViewModel tokenSearchResultViewModel5;
        String str3;
        WalletSearchResp walletSearchResp;
        TokenSearchResultViewModel tokenSearchResultViewModel6;
        Object objOLrzqt;
        TokenSearchResultViewModel tokenSearchResultViewModel7;
        WalletSearchExtraInfo extraSearchInfo;
        String str4;
        TokenSearchResultViewModel tokenSearchResultViewModel8;
        List<C18982fsg> listAhwBna2;
        ArrayList arrayList;
        C18980fse c18980fse2;
        MutableStateFlow mutableStateFlow;
        WalletSearchExtraInfo extraSearchInfo2;
        List<SearchDAppModel> discovers;
        MutableSharedFlow mutableSharedFlow2;
        MutableStateFlow mutableStateFlow2;
        C18980fse c18980fse3;
        String str5;
        SearchCompletionUiModel searchCompletionUiModel;
        TokenSearchResultViewModel tokenSearchResultViewModel9;
        MutableSharedFlow mutableSharedFlow3;
        C18980fse c18980fse4;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                tokenSearchResultViewModel2 = this.this$0;
                str = this.$searchKeyword;
                boolean z4 = this.$needSearch;
                Result.Application application2 = Result.Companion;
                MutableSharedFlow mutableSharedFlow4 = tokenSearchResultViewModel2.EZpvd;
                C18980fse c18980fse5 = new C18980fse(true, null, null, null, null, null, null, null, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
                this.L$0 = tokenSearchResultViewModel2;
                this.L$1 = str;
                this.L$2 = coroutineScope2;
                this.Z$0 = z4;
                this.label = 1;
                if (mutableSharedFlow4.emit(c18980fse5, this) == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                z = z4;
                C18914frR c18914frR = tokenSearchResultViewModel2.isConnected;
                this.L$0 = tokenSearchResultViewModel2;
                this.L$1 = str;
                this.L$2 = coroutineScope;
                this.L$3 = tokenSearchResultViewModel2;
                this.Z$0 = z;
                this.label = 2;
                objEZpvd = c18914frR.EZpvd(this);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                tokenSearchResultViewModel3 = tokenSearchResultViewModel2;
                listAhwBna = (List) objEZpvd;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                tokenSearchResultViewModel2.OLrzqt = listAhwBna;
                ?? r6 = tokenSearchResultViewModel3.valueOf == Long.MIN_VALUE ? 1 : 0;
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new TokenSearchResultViewModel$getSearchResult$1$1$searchResultDef$1(tokenSearchResultViewModel3, str, r6, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new TokenSearchResultViewModel$getSearchResult$1$1$searchCompletionDef$1(z, tokenSearchResultViewModel3, str, null), 3, null);
                this.L$0 = tokenSearchResultViewModel3;
                this.L$1 = str;
                this.L$2 = deferredAsync$default2;
                this.L$3 = null;
                this.Z$0 = z;
                this.I$0 = r6;
                this.label = 3;
                objAwait = deferredAsync$default.await(this);
                if (objAwait != objCopydefault) {
                    return objCopydefault;
                }
                tokenSearchResultViewModel4 = tokenSearchResultViewModel3;
                ?? r36 = r6;
                z2 = z;
                i = r36 == true ? 1 : 0;
                String str6 = str;
                deferred = deferredAsync$default2;
                str2 = str6;
                WalletSearchResponse walletSearchResponse2 = (WalletSearchResponse) ((AbstractC43419rot) objAwait).copydefault();
                this.L$0 = tokenSearchResultViewModel4;
                this.L$1 = str2;
                this.L$2 = walletSearchResponse2;
                this.Z$0 = z2;
                this.I$0 = i;
                this.label = 4;
                objAwait2 = deferred.await(this);
                if (objAwait2 != objCopydefault) {
                    return objCopydefault;
                }
                z3 = z2;
                walletSearchResponse = walletSearchResponse2;
                list = (List) ((AbstractC43419rot) objAwait2).copydefault();
                if (i == 0) {
                    if (!C33129mqd.KWHzl((Collection) (walletSearchResponse != null ? walletSearchResponse.getTokens() : null))) {
                        if (!C33129mqd.KWHzl((Collection) (walletSearchResponse != null ? walletSearchResponse.getAddresses() : null))) {
                            if (!C33129mqd.KWHzl((Collection) (walletSearchResponse != null ? walletSearchResponse.getDiscovers() : null)) && (walletSearchResponse == null || (extraSearchInfo = walletSearchResponse.getExtraSearchInfo()) == null || !extraSearchInfo.isSearchTypeUrl())) {
                                if (z3 && tokenSearchResultViewModel4.copydefault(str2)) {
                                    C18914frR c18914frR2 = tokenSearchResultViewModel4.isConnected;
                                    this.L$0 = tokenSearchResultViewModel4;
                                    this.L$1 = str2;
                                    this.L$2 = null;
                                    this.label = 8;
                                    objOLrzqt = c18914frR2.OLrzqt(str2, 1, this);
                                    if (objOLrzqt == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    tokenSearchResultViewModel7 = tokenSearchResultViewModel4;
                                    List list2 = (List) ((AbstractC43419rot) objOLrzqt).copydefault();
                                    walletSearchResp = list2 == null ? (WalletSearchResp) CollectionsKt___CollectionsKt.firstOrNull(list2) : null;
                                    TokenSearchResultViewModel tokenSearchResultViewModel10 = tokenSearchResultViewModel7;
                                    str3 = str2;
                                    tokenSearchResultViewModel6 = tokenSearchResultViewModel10;
                                    SearchCompletionUiModel searchCompletionUiModel2 = new SearchCompletionUiModel(walletSearchResp != null ? walletSearchResp.getText() : null);
                                    mutableStateFlow2 = tokenSearchResultViewModel6.copydefault;
                                    c18980fse3 = new C18980fse(false, null, null, null, null, null, searchCompletionUiModel2, str3, true, 63, null);
                                    this.L$0 = tokenSearchResultViewModel6;
                                    this.L$1 = str3;
                                    this.L$2 = searchCompletionUiModel2;
                                    this.label = 9;
                                    if (mutableStateFlow2.emit(c18980fse3, this) == objCopydefault) {
                                    }
                                } else {
                                    str3 = str2;
                                    walletSearchResp = null;
                                    tokenSearchResultViewModel6 = tokenSearchResultViewModel4;
                                    SearchCompletionUiModel searchCompletionUiModel22 = new SearchCompletionUiModel(walletSearchResp != null ? walletSearchResp.getText() : null);
                                    mutableStateFlow2 = tokenSearchResultViewModel6.copydefault;
                                    c18980fse3 = new C18980fse(false, null, null, null, null, null, searchCompletionUiModel22, str3, true, 63, null);
                                    this.L$0 = tokenSearchResultViewModel6;
                                    this.L$1 = str3;
                                    this.L$2 = searchCompletionUiModel22;
                                    this.label = 9;
                                    if (mutableStateFlow2.emit(c18980fse3, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    str5 = str3;
                                    searchCompletionUiModel = searchCompletionUiModel22;
                                    tokenSearchResultViewModel9 = tokenSearchResultViewModel6;
                                    mutableSharedFlow3 = tokenSearchResultViewModel9.EZpvd;
                                    c18980fse4 = new C18980fse(false, null, null, null, null, null, searchCompletionUiModel, str5, true, 63, null);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 10;
                                    if (mutableSharedFlow3.emit(c18980fse4, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                                    obj2 = objM7377constructorimpl;
                                    tokenSearchResultViewModel = this.this$0;
                                    if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                                        MutableStateFlow mutableStateFlow3 = tokenSearchResultViewModel.copydefault;
                                        C18980fse c18980fse6 = new C18980fse(false, null, null, null, null, null, null, null, true, 255, null);
                                        this.L$0 = obj2;
                                        this.L$1 = tokenSearchResultViewModel;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 11;
                                        if (mutableStateFlow3.emit(c18980fse6, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        mutableSharedFlow = tokenSearchResultViewModel.EZpvd;
                                        c18980fse = new C18980fse(false, null, null, null, null, null, null, null, true, 255, null);
                                        this.L$0 = obj2;
                                        this.L$1 = null;
                                        this.label = 12;
                                        if (mutableSharedFlow.emit(c18980fse, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                if (walletSearchResponse != null && (tokens = walletSearchResponse.getTokens()) != null) {
                    C18913frQ c18913frQ = tokenSearchResultViewModel4.AYXKKw;
                    this.L$0 = tokenSearchResultViewModel4;
                    this.L$1 = str2;
                    this.L$2 = walletSearchResponse;
                    this.L$3 = list;
                    this.label = 5;
                    objKWHzl = C18902frF.KWHzl(tokens, str2, c18913frQ, this);
                    if (objKWHzl != objCopydefault) {
                        return objCopydefault;
                    }
                    tokenSearchResultViewModel5 = tokenSearchResultViewModel4;
                    listAhwBna2 = (List) objKWHzl;
                    if (listAhwBna2 == null) {
                        str4 = str2;
                        tokenSearchResultViewModel8 = tokenSearchResultViewModel5;
                        tokenSearchResultViewModel8.values = listAhwBna2;
                        List<C18982fsg> listCopydefault = tokenSearchResultViewModel8.fetchVPNInfo.copydefault(tokenSearchResultViewModel8.EZpvd().getValue(), listAhwBna2);
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new SearchCompletionUiModel(((WalletSearchResp) it.next()).getText()));
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        List<SearchAddressModel> addresses = walletSearchResponse != null ? walletSearchResponse.getAddresses() : null;
                        if (walletSearchResponse == null || (discovers = walletSearchResponse.getDiscovers()) == null || (listAhwBna = C18902frF.OLrzqt(discovers, str4)) == null) {
                            List<C18977fsb> listAhwBna3 = yDY.AhwBna();
                        }
                        List<C18977fsb> list3 = listAhwBna3;
                        if (walletSearchResponse != null || (extraSearchInfo2 = walletSearchResponse.getExtraSearchInfo()) == null || !extraSearchInfo2.isSearchTypeUrl()) {
                            str4 = "";
                        }
                        c18980fse2 = new C18980fse(false, listCopydefault, arrayList, addresses, list3, str4, null, null, false, 449, null);
                        mutableStateFlow = tokenSearchResultViewModel8.copydefault;
                        this.L$0 = tokenSearchResultViewModel8;
                        this.L$1 = c18980fse2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 6;
                        if (mutableStateFlow.emit(c18980fse2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableSharedFlow2 = tokenSearchResultViewModel8.EZpvd;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 7;
                        if (mutableSharedFlow2.emit(c18980fse2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        obj2 = objM7377constructorimpl;
                        tokenSearchResultViewModel = this.this$0;
                        if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    tokenSearchResultViewModel4 = tokenSearchResultViewModel5;
                }
                listAhwBna2 = yDY.AhwBna();
                str4 = str2;
                tokenSearchResultViewModel8 = tokenSearchResultViewModel4;
                tokenSearchResultViewModel8.values = listAhwBna2;
                List<C18982fsg> listCopydefault2 = tokenSearchResultViewModel8.fetchVPNInfo.copydefault(tokenSearchResultViewModel8.EZpvd().getValue(), listAhwBna2);
                if (list != null) {
                }
                if (walletSearchResponse != null) {
                }
                if (walletSearchResponse == null) {
                    List<C18977fsb> listAhwBna32 = yDY.AhwBna();
                    List<C18977fsb> list32 = listAhwBna32;
                    if (walletSearchResponse != null) {
                        str4 = "";
                        c18980fse2 = new C18980fse(false, listCopydefault2, arrayList, addresses, list32, str4, null, null, false, 449, null);
                        mutableStateFlow = tokenSearchResultViewModel8.copydefault;
                        this.L$0 = tokenSearchResultViewModel8;
                        this.L$1 = c18980fse2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 6;
                        if (mutableStateFlow.emit(c18980fse2, this) == objCopydefault) {
                        }
                        mutableSharedFlow2 = tokenSearchResultViewModel8.EZpvd;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 7;
                        if (mutableSharedFlow2.emit(c18980fse2, this) == objCopydefault) {
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        obj2 = objM7377constructorimpl;
                        tokenSearchResultViewModel = this.this$0;
                        if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                z = this.Z$0;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$2;
                str = (String) this.L$1;
                TokenSearchResultViewModel tokenSearchResultViewModel11 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope3;
                tokenSearchResultViewModel2 = tokenSearchResultViewModel11;
                C18914frR c18914frR3 = tokenSearchResultViewModel2.isConnected;
                this.L$0 = tokenSearchResultViewModel2;
                this.L$1 = str;
                this.L$2 = coroutineScope;
                this.L$3 = tokenSearchResultViewModel2;
                this.Z$0 = z;
                this.label = 2;
                objEZpvd = c18914frR3.EZpvd(this);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 2:
                z = this.Z$0;
                tokenSearchResultViewModel2 = (TokenSearchResultViewModel) this.L$3;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$2;
                String str7 = (String) this.L$1;
                TokenSearchResultViewModel tokenSearchResultViewModel12 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope4;
                str = str7;
                tokenSearchResultViewModel3 = tokenSearchResultViewModel12;
                objEZpvd = obj;
                listAhwBna = (List) objEZpvd;
                if (listAhwBna == null) {
                }
                tokenSearchResultViewModel2.OLrzqt = listAhwBna;
                if (tokenSearchResultViewModel3.valueOf == Long.MIN_VALUE) {
                }
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new TokenSearchResultViewModel$getSearchResult$1$1$searchResultDef$1(tokenSearchResultViewModel3, str, r6, null), 3, null);
                Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new TokenSearchResultViewModel$getSearchResult$1$1$searchCompletionDef$1(z, tokenSearchResultViewModel3, str, null), 3, null);
                this.L$0 = tokenSearchResultViewModel3;
                this.L$1 = str;
                this.L$2 = deferredAsync$default22;
                this.L$3 = null;
                this.Z$0 = z;
                this.I$0 = r6;
                this.label = 3;
                objAwait = deferredAsync$default3.await(this);
                if (objAwait != objCopydefault) {
                }
                break;
            case 3:
                i = this.I$0;
                z2 = this.Z$0;
                deferred = (Deferred) this.L$2;
                String str8 = (String) this.L$1;
                tokenSearchResultViewModel4 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str8;
                objAwait = obj;
                WalletSearchResponse walletSearchResponse22 = (WalletSearchResponse) ((AbstractC43419rot) objAwait).copydefault();
                this.L$0 = tokenSearchResultViewModel4;
                this.L$1 = str2;
                this.L$2 = walletSearchResponse22;
                this.Z$0 = z2;
                this.I$0 = i;
                this.label = 4;
                objAwait2 = deferred.await(this);
                if (objAwait2 != objCopydefault) {
                }
                break;
            case 4:
                i = this.I$0;
                boolean z5 = this.Z$0;
                WalletSearchResponse walletSearchResponse3 = (WalletSearchResponse) this.L$2;
                String str9 = (String) this.L$1;
                tokenSearchResultViewModel4 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str9;
                z3 = z5;
                walletSearchResponse = walletSearchResponse3;
                objAwait2 = obj;
                list = (List) ((AbstractC43419rot) objAwait2).copydefault();
                if (i == 0) {
                }
                if (walletSearchResponse != null) {
                    C18913frQ c18913frQ2 = tokenSearchResultViewModel4.AYXKKw;
                    this.L$0 = tokenSearchResultViewModel4;
                    this.L$1 = str2;
                    this.L$2 = walletSearchResponse;
                    this.L$3 = list;
                    this.label = 5;
                    objKWHzl = C18902frF.KWHzl(tokens, str2, c18913frQ2, this);
                    if (objKWHzl != objCopydefault) {
                    }
                }
                listAhwBna2 = yDY.AhwBna();
                str4 = str2;
                tokenSearchResultViewModel8 = tokenSearchResultViewModel4;
                tokenSearchResultViewModel8.values = listAhwBna2;
                List<C18982fsg> listCopydefault22 = tokenSearchResultViewModel8.fetchVPNInfo.copydefault(tokenSearchResultViewModel8.EZpvd().getValue(), listAhwBna2);
                if (list != null) {
                }
                if (walletSearchResponse != null) {
                }
                if (walletSearchResponse == null) {
                }
                return Unit.INSTANCE;
            case 5:
                List list4 = (List) this.L$3;
                walletSearchResponse = (WalletSearchResponse) this.L$2;
                String str10 = (String) this.L$1;
                tokenSearchResultViewModel5 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str10;
                list = list4;
                objKWHzl = obj;
                listAhwBna2 = (List) objKWHzl;
                if (listAhwBna2 == null) {
                }
                break;
            case 6:
                c18980fse2 = (C18980fse) this.L$1;
                tokenSearchResultViewModel8 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = tokenSearchResultViewModel8.EZpvd;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 7;
                if (mutableSharedFlow2.emit(c18980fse2, this) == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                obj2 = objM7377constructorimpl;
                tokenSearchResultViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                }
                return Unit.INSTANCE;
            case 7:
            case 10:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                obj2 = objM7377constructorimpl;
                tokenSearchResultViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                }
                return Unit.INSTANCE;
            case 8:
                String str11 = (String) this.L$1;
                tokenSearchResultViewModel7 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str11;
                objOLrzqt = obj;
                List list22 = (List) ((AbstractC43419rot) objOLrzqt).copydefault();
                if (list22 == null) {
                }
                TokenSearchResultViewModel tokenSearchResultViewModel102 = tokenSearchResultViewModel7;
                str3 = str2;
                tokenSearchResultViewModel6 = tokenSearchResultViewModel102;
                SearchCompletionUiModel searchCompletionUiModel222 = new SearchCompletionUiModel(walletSearchResp != null ? walletSearchResp.getText() : null);
                mutableStateFlow2 = tokenSearchResultViewModel6.copydefault;
                c18980fse3 = new C18980fse(false, null, null, null, null, null, searchCompletionUiModel222, str3, true, 63, null);
                this.L$0 = tokenSearchResultViewModel6;
                this.L$1 = str3;
                this.L$2 = searchCompletionUiModel222;
                this.label = 9;
                if (mutableStateFlow2.emit(c18980fse3, this) == objCopydefault) {
                }
                break;
            case 9:
                SearchCompletionUiModel searchCompletionUiModel3 = (SearchCompletionUiModel) this.L$2;
                String str12 = (String) this.L$1;
                tokenSearchResultViewModel9 = (TokenSearchResultViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                searchCompletionUiModel = searchCompletionUiModel3;
                str5 = str12;
                mutableSharedFlow3 = tokenSearchResultViewModel9.EZpvd;
                c18980fse4 = new C18980fse(false, null, null, null, null, null, searchCompletionUiModel, str5, true, 63, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 10;
                if (mutableSharedFlow3.emit(c18980fse4, this) == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                obj2 = objM7377constructorimpl;
                tokenSearchResultViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                }
                return Unit.INSTANCE;
            case 11:
                tokenSearchResultViewModel = (TokenSearchResultViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = tokenSearchResultViewModel.EZpvd;
                c18980fse = new C18980fse(false, null, null, null, null, null, null, null, true, 255, null);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 12;
                if (mutableSharedFlow.emit(c18980fse, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 12:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
