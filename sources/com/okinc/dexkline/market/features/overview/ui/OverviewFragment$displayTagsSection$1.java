package com.okinc.dexkline.market.features.overview.ui;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.market.features.overview.domain.BasicInfo;
import com.okinc.dexkline.market.features.overview.domain.Overview;
import com.okinc.dexkline.market.features.overview.ui.OverviewFragment$displayTagsSection$1;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.tag.ui.TagViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C34338naG;
import o.C34394nbJ;
import o.C34431nbu;
import o.C34536ndt;
import o.C56391yDq;
import o.C56442yFn;
import o.C59443zhD;
import o.mQA;
import o.oNY;

/* JADX INFO: loaded from: classes15.dex */
public final class OverviewFragment$displayTagsSection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BasicInfo $basicInfo;
    final /* synthetic */ Overview $overviewData;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C34338naG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewFragment$displayTagsSection$1(C34338naG c34338naG, Overview overview, BasicInfo basicInfo, Continuation<? super OverviewFragment$displayTagsSection$1> continuation) {
        super(2, continuation);
        this.this$0 = c34338naG;
        this.$overviewData = overview;
        this.$basicInfo = basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewFragment$displayTagsSection$1(this.this$0, this.$overviewData, this.$basicInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewFragment$displayTagsSection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v20, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02be  */
    /* JADX WARN: Type inference failed for: r10v43, types: [T, com.okinc.dexkline.market.features.tag.domain.TagWrapper] */
    /* JADX WARN: Type inference failed for: r10v46, types: [T, com.okinc.dexkline.market.features.tag.domain.TagWrapper] */
    /* JADX WARN: Type inference failed for: r11v20, types: [T, com.okinc.dexkline.market.features.tag.domain.TagWrapper] */
    /* JADX WARN: Type inference failed for: r11v7, types: [T, com.okinc.dexkline.market.features.tag.domain.TagWrapper] */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, com.okinc.dexkline.market.features.tag.domain.TagWrapper] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Object objKWHzl;
        TokenDetail tokenDetail;
        Object objEZpvd;
        List<TagWrapper> listFetchVPNInfo;
        Iterator<T> it;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        TagWrapper tagWrapper;
        Ref.ObjectRef objectRef9;
        Object objM7386unboximpl;
        TagWrapper tagWrapper2;
        Ref.ObjectRef objectRef10;
        Ref.ObjectRef objectRef11;
        Ref.ObjectRef objectRef12;
        Object objEZpvd2;
        Ref.ObjectRef objectRef13;
        Ref.ObjectRef objectRef14;
        TagWrapper tagWrapper3;
        Ref.ObjectRef objectRef15;
        Ref.ObjectRef objectRef16;
        Object objEZpvd3;
        Ref.ObjectRef objectRef17;
        Object objEZpvd4;
        Ref.ObjectRef objectRef18;
        Ref.ObjectRef objectRef19;
        Object objAEQbTJ;
        TagWrapper tagWrapper4;
        Ref.ObjectRef objectRef20;
        TagWrapper tagWrapper5;
        oNY onyAYXKKw;
        C34431nbu c34431nbu;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                objectRef3 = new Ref.ObjectRef();
                objectRef4 = new Ref.ObjectRef();
                TagViewModel tagViewModelAkhnZx = this.this$0.AkhnZx();
                LatestMarketInfoBean latestMarketInfoBeanAYXKKw = this.this$0.AYXKKw();
                this.L$0 = objectRef;
                this.L$1 = objectRef2;
                this.L$2 = objectRef3;
                this.L$3 = objectRef4;
                this.label = 1;
                objKWHzl = tagViewModelAkhnZx.KWHzl(latestMarketInfoBeanAYXKKw, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objKWHzl)) {
                    objKWHzl = null;
                }
                tokenDetail = (TokenDetail) objKWHzl;
                if (tokenDetail != null && (listFetchVPNInfo = tokenDetail.fetchVPNInfo()) != null) {
                    it = listFetchVPNInfo.iterator();
                    while (it.hasNext()) {
                        ?? r11 = (TagWrapper) it.next();
                        C34536ndt c34536ndt = C34536ndt.OLrzqt;
                        if (c34536ndt.AEQbTJ().contains(r11.KWHzl())) {
                            objectRef.element = r11;
                        }
                        if (Intrinsics.EZpvd((Object) r11.KWHzl(), (Object) "suspicious")) {
                            objectRef2.element = r11;
                        }
                        if (Intrinsics.EZpvd((Object) r11.KWHzl(), (Object) "sniper")) {
                            objectRef3.element = r11;
                        }
                        if (c34536ndt.copydefault().contains(r11.KWHzl())) {
                            objectRef4.element = r11;
                        }
                    }
                }
                TagViewModel tagViewModelAkhnZx2 = this.this$0.AkhnZx();
                this.L$0 = objectRef;
                this.L$1 = objectRef2;
                this.L$2 = objectRef3;
                this.L$3 = objectRef4;
                this.label = 2;
                objEZpvd = tagViewModelAkhnZx2.EZpvd("topHolder", this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                Ref.ObjectRef objectRef21 = objectRef2;
                objectRef5 = objectRef4;
                objectRef6 = objectRef;
                objectRef7 = objectRef3;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                    objEZpvd = null;
                }
                TagWrapper tagWrapper6 = new TagWrapper(null, (TagMeta) objEZpvd, 1, null);
                if (objectRef6.element == 0) {
                    TagViewModel tagViewModelAkhnZx3 = this.this$0.AkhnZx();
                    this.L$0 = objectRef21;
                    this.L$1 = objectRef7;
                    this.L$2 = objectRef5;
                    this.L$3 = tagWrapper6;
                    this.L$4 = objectRef6;
                    this.label = 3;
                    Object objEZpvd5 = tagViewModelAkhnZx3.EZpvd("dev", this);
                    if (objEZpvd5 == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef9 = objectRef21;
                    tagWrapper = tagWrapper6;
                    objM7386unboximpl = objEZpvd5;
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    objectRef6.element = new TagWrapper(null, (TagMeta) objM7386unboximpl, 1, null);
                    objectRef8 = objectRef9;
                    if (objectRef8.element == 0) {
                        TagViewModel tagViewModelAkhnZx4 = this.this$0.AkhnZx();
                        this.L$0 = objectRef8;
                        this.L$1 = objectRef7;
                        this.L$2 = objectRef5;
                        this.L$3 = tagWrapper;
                        this.L$4 = objectRef8;
                        this.label = 4;
                        objEZpvd2 = tagViewModelAkhnZx4.EZpvd("suspicious", this);
                        if (objEZpvd2 == objCopydefault) {
                            return objCopydefault;
                        }
                        tagWrapper2 = tagWrapper;
                        objectRef10 = objectRef5;
                        objectRef13 = objectRef7;
                        objectRef14 = objectRef8;
                        if (Result.m7383isFailureimpl(objEZpvd2)) {
                            objEZpvd2 = null;
                        }
                        objectRef8.element = new TagWrapper(null, (TagMeta) objEZpvd2, 1, null);
                        objectRef12 = objectRef13;
                        objectRef11 = objectRef14;
                        if (objectRef12.element == 0) {
                            TagViewModel tagViewModelAkhnZx5 = this.this$0.AkhnZx();
                            this.L$0 = objectRef11;
                            this.L$1 = objectRef12;
                            this.L$2 = objectRef10;
                            this.L$3 = tagWrapper2;
                            this.L$4 = objectRef12;
                            this.label = 5;
                            objEZpvd3 = tagViewModelAkhnZx5.EZpvd("sniper", this);
                            if (objEZpvd3 == objCopydefault) {
                                return objCopydefault;
                            }
                            tagWrapper3 = tagWrapper2;
                            objectRef17 = objectRef10;
                            objectRef15 = objectRef12;
                            if (Result.m7383isFailureimpl(objEZpvd3)) {
                                objEZpvd3 = null;
                            }
                            objectRef12.element = new TagWrapper(null, (TagMeta) objEZpvd3, 1, null);
                            objectRef16 = objectRef17;
                            if (objectRef16.element == 0) {
                                TagViewModel tagViewModelAkhnZx6 = this.this$0.AkhnZx();
                                this.L$0 = objectRef11;
                                this.L$1 = objectRef15;
                                this.L$2 = objectRef16;
                                this.L$3 = tagWrapper3;
                                this.L$4 = objectRef16;
                                this.label = 6;
                                objEZpvd4 = tagViewModelAkhnZx6.EZpvd("smartMoney", this);
                                if (objEZpvd4 == objCopydefault) {
                                    return objCopydefault;
                                }
                                objectRef18 = objectRef16;
                                if (Result.m7383isFailureimpl(objEZpvd4)) {
                                    objEZpvd4 = null;
                                }
                                objectRef16.element = new TagWrapper(null, (TagMeta) objEZpvd4, 1, null);
                                objectRef16 = objectRef18;
                            }
                            objectRef19 = objectRef11;
                            TagViewModel tagViewModelAkhnZx7 = this.this$0.AkhnZx();
                            Float fFIwbmz = C59443zhD.fIwbmz(this.$overviewData.copydefault());
                            this.L$0 = objectRef19;
                            this.L$1 = objectRef15;
                            this.L$2 = objectRef16;
                            this.L$3 = tagWrapper3;
                            this.L$4 = null;
                            this.label = 7;
                            objAEQbTJ = tagViewModelAkhnZx7.AEQbTJ(fFIwbmz, this);
                            if (objAEQbTJ != objCopydefault) {
                                return objCopydefault;
                            }
                            tagWrapper4 = tagWrapper3;
                            objectRef20 = objectRef15;
                            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                                objAEQbTJ = null;
                            }
                            tagWrapper5 = (TagWrapper) objAEQbTJ;
                            onyAYXKKw = C34338naG.AYXKKw(this.this$0);
                            if (onyAYXKKw != null && (c34431nbu = onyAYXKKw.AhwBna) != null) {
                                String strValueOf = this.$basicInfo.valueOf();
                                TagWrapper tagWrapper7 = (TagWrapper) objectRef19.element;
                                TagWrapper tagWrapper8 = (TagWrapper) objectRef20.element;
                                TagWrapper tagWrapper9 = (TagWrapper) objectRef16.element;
                                LatestMarketInfoBean latestMarketInfoBeanAYXKKw2 = this.this$0.AYXKKw();
                                C34394nbJ c34394nbJ = new C34394nbJ(strValueOf, tagWrapper4, null, tagWrapper7, tagWrapper8, tagWrapper5, tagWrapper9, latestMarketInfoBeanAYXKKw2 != null ? latestMarketInfoBeanAYXKKw2.getTop10HoldAmountPercentage() : null, this.$overviewData.OLrzqt(), this.$overviewData.valueOf(), null, null, null, 7168, null);
                                final C34338naG c34338naG = this.this$0;
                                Function1 function1 = new Function1() { // from class: o.naM
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return OverviewFragment$displayTagsSection$1.invokeSuspend$lambda$1(c34338naG, (kotlin.Pair) obj2);
                                    }
                                };
                                final C34338naG c34338naG2 = this.this$0;
                                final Overview overview = this.$overviewData;
                                Function0 function0 = new Function0() { // from class: o.naN
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return OverviewFragment$displayTagsSection$1.invokeSuspend$lambda$2(c34338naG2, overview);
                                    }
                                };
                                final C34338naG c34338naG3 = this.this$0;
                                c34431nbu.setLabels(c34394nbJ, (4 & 2) != 0 ? null : function1, (4 & 4) != 0 ? null : null, (4 & 8) != 0 ? null : function0, (4 & 16) != 0 ? null : new Function1() { // from class: o.naP
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return OverviewFragment$displayTagsSection$1.invokeSuspend$lambda$3(c34338naG3, (java.util.List) obj2);
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                        tagWrapper3 = tagWrapper2;
                        Ref.ObjectRef objectRef22 = objectRef10;
                        objectRef15 = objectRef12;
                        objectRef16 = objectRef22;
                        if (objectRef16.element == 0) {
                        }
                        objectRef19 = objectRef11;
                        TagViewModel tagViewModelAkhnZx72 = this.this$0.AkhnZx();
                        Float fFIwbmz2 = C59443zhD.fIwbmz(this.$overviewData.copydefault());
                        this.L$0 = objectRef19;
                        this.L$1 = objectRef15;
                        this.L$2 = objectRef16;
                        this.L$3 = tagWrapper3;
                        this.L$4 = null;
                        this.label = 7;
                        objAEQbTJ = tagViewModelAkhnZx72.AEQbTJ(fFIwbmz2, this);
                        if (objAEQbTJ != objCopydefault) {
                        }
                    } else {
                        tagWrapper2 = tagWrapper;
                        objectRef10 = objectRef5;
                        objectRef11 = objectRef8;
                        objectRef12 = objectRef7;
                        if (objectRef12.element == 0) {
                        }
                    }
                } else {
                    objectRef8 = objectRef21;
                    tagWrapper = tagWrapper6;
                    if (objectRef8.element == 0) {
                    }
                }
                break;
            case 1:
                objectRef4 = (Ref.ObjectRef) this.L$3;
                objectRef3 = (Ref.ObjectRef) this.L$2;
                objectRef2 = (Ref.ObjectRef) this.L$1;
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objKWHzl)) {
                }
                tokenDetail = (TokenDetail) objKWHzl;
                if (tokenDetail != null) {
                    it = listFetchVPNInfo.iterator();
                    while (it.hasNext()) {
                    }
                }
                TagViewModel tagViewModelAkhnZx22 = this.this$0.AkhnZx();
                this.L$0 = objectRef;
                this.L$1 = objectRef2;
                this.L$2 = objectRef3;
                this.L$3 = objectRef4;
                this.label = 2;
                objEZpvd = tagViewModelAkhnZx22.EZpvd("topHolder", this);
                if (objEZpvd == objCopydefault) {
                }
                Ref.ObjectRef objectRef212 = objectRef2;
                objectRef5 = objectRef4;
                objectRef6 = objectRef;
                objectRef7 = objectRef3;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagWrapper tagWrapper62 = new TagWrapper(null, (TagMeta) objEZpvd, 1, null);
                if (objectRef6.element == 0) {
                }
                break;
            case 2:
                objectRef4 = (Ref.ObjectRef) this.L$3;
                objectRef3 = (Ref.ObjectRef) this.L$2;
                objectRef2 = (Ref.ObjectRef) this.L$1;
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                Ref.ObjectRef objectRef2122 = objectRef2;
                objectRef5 = objectRef4;
                objectRef6 = objectRef;
                objectRef7 = objectRef3;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagWrapper tagWrapper622 = new TagWrapper(null, (TagMeta) objEZpvd, 1, null);
                if (objectRef6.element == 0) {
                }
                break;
            case 3:
                objectRef6 = (Ref.ObjectRef) this.L$4;
                tagWrapper = (TagWrapper) this.L$3;
                objectRef5 = (Ref.ObjectRef) this.L$2;
                objectRef7 = (Ref.ObjectRef) this.L$1;
                objectRef9 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                objectRef6.element = new TagWrapper(null, (TagMeta) objM7386unboximpl, 1, null);
                objectRef8 = objectRef9;
                if (objectRef8.element == 0) {
                }
                break;
            case 4:
                objectRef8 = (Ref.ObjectRef) this.L$4;
                tagWrapper2 = (TagWrapper) this.L$3;
                objectRef10 = (Ref.ObjectRef) this.L$2;
                objectRef13 = (Ref.ObjectRef) this.L$1;
                objectRef14 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd2 = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd2)) {
                }
                objectRef8.element = new TagWrapper(null, (TagMeta) objEZpvd2, 1, null);
                objectRef12 = objectRef13;
                objectRef11 = objectRef14;
                if (objectRef12.element == 0) {
                }
                break;
            case 5:
                objectRef12 = (Ref.ObjectRef) this.L$4;
                tagWrapper3 = (TagWrapper) this.L$3;
                objectRef17 = (Ref.ObjectRef) this.L$2;
                objectRef15 = (Ref.ObjectRef) this.L$1;
                objectRef11 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd3 = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd3)) {
                }
                objectRef12.element = new TagWrapper(null, (TagMeta) objEZpvd3, 1, null);
                objectRef16 = objectRef17;
                if (objectRef16.element == 0) {
                }
                objectRef19 = objectRef11;
                TagViewModel tagViewModelAkhnZx722 = this.this$0.AkhnZx();
                Float fFIwbmz22 = C59443zhD.fIwbmz(this.$overviewData.copydefault());
                this.L$0 = objectRef19;
                this.L$1 = objectRef15;
                this.L$2 = objectRef16;
                this.L$3 = tagWrapper3;
                this.L$4 = null;
                this.label = 7;
                objAEQbTJ = tagViewModelAkhnZx722.AEQbTJ(fFIwbmz22, this);
                if (objAEQbTJ != objCopydefault) {
                }
                break;
            case 6:
                objectRef16 = (Ref.ObjectRef) this.L$4;
                tagWrapper3 = (TagWrapper) this.L$3;
                objectRef18 = (Ref.ObjectRef) this.L$2;
                objectRef15 = (Ref.ObjectRef) this.L$1;
                objectRef11 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd4 = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd4)) {
                }
                objectRef16.element = new TagWrapper(null, (TagMeta) objEZpvd4, 1, null);
                objectRef16 = objectRef18;
                objectRef19 = objectRef11;
                TagViewModel tagViewModelAkhnZx7222 = this.this$0.AkhnZx();
                Float fFIwbmz222 = C59443zhD.fIwbmz(this.$overviewData.copydefault());
                this.L$0 = objectRef19;
                this.L$1 = objectRef15;
                this.L$2 = objectRef16;
                this.L$3 = tagWrapper3;
                this.L$4 = null;
                this.label = 7;
                objAEQbTJ = tagViewModelAkhnZx7222.AEQbTJ(fFIwbmz222, this);
                if (objAEQbTJ != objCopydefault) {
                }
                break;
            case 7:
                TagWrapper tagWrapper10 = (TagWrapper) this.L$3;
                objectRef16 = (Ref.ObjectRef) this.L$2;
                objectRef20 = (Ref.ObjectRef) this.L$1;
                objectRef19 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                tagWrapper4 = tagWrapper10;
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                tagWrapper5 = (TagWrapper) objAEQbTJ;
                onyAYXKKw = C34338naG.AYXKKw(this.this$0);
                if (onyAYXKKw != null) {
                    String strValueOf2 = this.$basicInfo.valueOf();
                    TagWrapper tagWrapper72 = (TagWrapper) objectRef19.element;
                    TagWrapper tagWrapper82 = (TagWrapper) objectRef20.element;
                    TagWrapper tagWrapper92 = (TagWrapper) objectRef16.element;
                    LatestMarketInfoBean latestMarketInfoBeanAYXKKw22 = this.this$0.AYXKKw();
                    C34394nbJ c34394nbJ2 = new C34394nbJ(strValueOf2, tagWrapper4, null, tagWrapper72, tagWrapper82, tagWrapper5, tagWrapper92, latestMarketInfoBeanAYXKKw22 != null ? latestMarketInfoBeanAYXKKw22.getTop10HoldAmountPercentage() : null, this.$overviewData.OLrzqt(), this.$overviewData.valueOf(), null, null, null, 7168, null);
                    final C34338naG c34338naG4 = this.this$0;
                    Function1 function12 = new Function1() { // from class: o.naM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OverviewFragment$displayTagsSection$1.invokeSuspend$lambda$1(c34338naG4, (kotlin.Pair) obj2);
                        }
                    };
                    final C34338naG c34338naG22 = this.this$0;
                    final Overview overview2 = this.$overviewData;
                    Function0 function02 = new Function0() { // from class: o.naN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OverviewFragment$displayTagsSection$1.invokeSuspend$lambda$2(c34338naG22, overview2);
                        }
                    };
                    final C34338naG c34338naG32 = this.this$0;
                    c34431nbu.setLabels(c34394nbJ2, (4 & 2) != 0 ? null : function12, (4 & 4) != 0 ? null : null, (4 & 8) != 0 ? null : function02, (4 & 16) != 0 ? null : new Function1() { // from class: o.naP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OverviewFragment$displayTagsSection$1.invokeSuspend$lambda$3(c34338naG32, (java.util.List) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C34338naG c34338naG, Pair pair) {
        c34338naG.valueOf().KWHzl(new mQA(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(C34338naG c34338naG, Overview overview) {
        c34338naG.KWHzl(overview);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(C34338naG c34338naG, List list) {
        c34338naG.ejfBZ();
        return Unit.INSTANCE;
    }
}
