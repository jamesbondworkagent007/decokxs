package o;

import com.okinc.okimcore.feature.share.GetShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.share.GetShareTargetsUseCaseImpl$getSuggestedContacts$1;
import com.okinc.okimcore.feature.share.GetShareTargetsUseCaseImpl$invoke$1;
import com.okinc.okimcore.feature.share.GetShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.share.ShareTarget;
import com.okinc.okimcore.model.share.ShareTargetType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44378sNp implements InterfaceC44379sNq {
    public final java.util.List<OKConversationType> EZpvd;
    public final sGF KWHzl;
    public final C44198sGy copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C44378sNp(@NotNull sGF sgf, @NotNull C44198sGy c44198sGy) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(c44198sGy, "");
        this.KWHzl = sgf;
        this.copydefault = c44198sGy;
        this.EZpvd = yDY.gEmmrt(OKConversationType.GROUP, OKConversationType.PRIVATE);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$4(ClassGen.java:366)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:367)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:329)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
     */
    public static final /* synthetic */ java.lang.Object KWHzl(C44378sNp c44378sNp, java.util.Set set, Continuation continuation) {
        return c44378sNp.OLrzqt(set, continuation);
    }

    /* JADX INFO: renamed from: o.sNp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44379sNq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<ShareTarget>> continuation) throws java.lang.Throwable {
        GetShareTargetsUseCaseImpl$invoke$1 getShareTargetsUseCaseImpl$invoke$1;
        C44378sNp c44378sNp;
        java.util.List list;
        if (continuation instanceof GetShareTargetsUseCaseImpl$invoke$1) {
            getShareTargetsUseCaseImpl$invoke$1 = (GetShareTargetsUseCaseImpl$invoke$1) continuation;
            int i = getShareTargetsUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getShareTargetsUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getShareTargetsUseCaseImpl$invoke$1 = new GetShareTargetsUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objFirst = getShareTargetsUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getShareTargetsUseCaseImpl$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objFirst);
                Result.Application application = Result.Companion;
                TaskDescription taskDescription = new TaskDescription(this.KWHzl.OLrzqt());
                getShareTargetsUseCaseImpl$invoke$1.L$0 = this;
                getShareTargetsUseCaseImpl$invoke$1.label = 1;
                objFirst = FlowKt.first(taskDescription, getShareTargetsUseCaseImpl$invoke$1);
                if (objFirst == objCopydefault) {
                    return objCopydefault;
                }
                c44378sNp = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) getShareTargetsUseCaseImpl$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objFirst);
                    return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) objFirst);
                }
                c44378sNp = (C44378sNp) getShareTargetsUseCaseImpl$invoke$1.L$0;
                C56391yDq.AEQbTJ(objFirst);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : (java.lang.Iterable) objFirst) {
                if (c44378sNp.EZpvd((OKConversation) obj)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C44471sRa.copydefault((OKConversation) it.next()));
            }
            if (arrayList2.size() > 5) {
                return arrayList2;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                java.lang.String strOLrzqt = ((ShareTarget) it2.next()).OLrzqt();
                if (strOLrzqt != null) {
                    arrayList3.add(strOLrzqt);
                }
            }
            java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
            getShareTargetsUseCaseImpl$invoke$1.L$0 = arrayList2;
            getShareTargetsUseCaseImpl$invoke$1.label = 2;
            java.lang.Object objOLrzqt = c44378sNp.OLrzqt(setOqFWZa, getShareTargetsUseCaseImpl$invoke$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList2;
            objFirst = objOLrzqt;
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) objFirst);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : yDY.AhwBna();
        }
    }

    public final boolean EZpvd(OKConversation oKConversation) {
        return (!this.EZpvd.contains(oKConversation.getConversationType()) || C44170sFx.copydefault(oKConversation) || C44170sFx.KWHzl(oKConversation)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[LOOP:0: B:23:0x0070->B:25:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.Set<java.lang.String> set, Continuation<? super java.util.List<ShareTarget>> continuation) throws java.lang.Throwable {
        GetShareTargetsUseCaseImpl$getSuggestedContacts$1 getShareTargetsUseCaseImpl$getSuggestedContacts$1;
        java.util.Iterator it;
        if (continuation instanceof GetShareTargetsUseCaseImpl$getSuggestedContacts$1) {
            getShareTargetsUseCaseImpl$getSuggestedContacts$1 = (GetShareTargetsUseCaseImpl$getSuggestedContacts$1) continuation;
            int i = getShareTargetsUseCaseImpl$getSuggestedContacts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getShareTargetsUseCaseImpl$getSuggestedContacts$1.label = i - Integer.MIN_VALUE;
            } else {
                getShareTargetsUseCaseImpl$getSuggestedContacts$1 = new GetShareTargetsUseCaseImpl$getSuggestedContacts$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getShareTargetsUseCaseImpl$getSuggestedContacts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getShareTargetsUseCaseImpl$getSuggestedContacts$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C44198sGy c44198sGy = this.copydefault;
            getShareTargetsUseCaseImpl$getSuggestedContacts$1.L$0 = set;
            getShareTargetsUseCaseImpl$getSuggestedContacts$1.label = 1;
            objKWHzl = c44198sGy.KWHzl(getShareTargetsUseCaseImpl$getSuggestedContacts$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                java.lang.Iterable iterable = (java.lang.Iterable) objKWHzl;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(C44471sRa.copydefault((RelationInfo) it.next(), ShareTargetType.Contact));
                }
                return arrayList;
            }
            set = (java.util.Set) getShareTargetsUseCaseImpl$getSuggestedContacts$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        ActionBar actionBar = new ActionBar((Flow) objKWHzl, set);
        getShareTargetsUseCaseImpl$getSuggestedContacts$1.L$0 = null;
        getShareTargetsUseCaseImpl$getSuggestedContacts$1.label = 2;
        objKWHzl = FlowKt.first(actionBar, getShareTargetsUseCaseImpl$getSuggestedContacts$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) objKWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o.sNp$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends RelationInfo>> {
        public final /* synthetic */ java.util.Set EZpvd;
        public final /* synthetic */ Flow KWHzl;

        public ActionBar(Flow flow, java.util.Set set) {
            this.KWHzl = flow;
            this.EZpvd = set;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends RelationInfo>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sNp$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ java.util.Set AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, java.util.Set set) {
                this.copydefault = flowCollector;
                this.AEQbTJ = set;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                GetShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1 getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1;
                if (continuation instanceof GetShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1) {
                    getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1 = (GetShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1) continuation;
                    int i = getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1 = new GetShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (!this.AEQbTJ.contains(((RelationInfo) t).getContactsId())) {
                            arrayList.add(t);
                        }
                    }
                    getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, getShareTargetsUseCaseImpl$getSuggestedContacts$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.sNp$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends OKConversation>> {
        public final /* synthetic */ Flow AEQbTJ;

        public TaskDescription(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends OKConversation>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sNp$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                GetShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1 getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof GetShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1) {
                    getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1 = (GetShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1) continuation;
                    int i = getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1 = new GetShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    if (objM7386unboximpl != null) {
                        getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(objM7386unboximpl, getShareTargetsUseCaseImpl$invoke$lambda$3$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }
}
