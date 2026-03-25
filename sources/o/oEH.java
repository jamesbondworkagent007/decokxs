package o;

import com.okinc.im.usecase.messagelist.GetMessageListUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEH {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final oCA AEQbTJ;
    public final C35847oFx KWHzl;
    public final sKH OLrzqt;

    @yCM
    public oEH(@NotNull sKH skh, @NotNull oCA oca, @NotNull C35847oFx c35847oFx) {
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(oca, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        this.OLrzqt = skh;
        this.AEQbTJ = oca;
        this.KWHzl = c35847oFx;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0179 -> B:36:0x017c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull OKConversation oKConversation, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, long j, boolean z, boolean z2, @NotNull Continuation<? super java.util.List<OKMessage>> continuation) throws java.lang.Throwable {
        GetMessageListUseCase$execute$1 getMessageListUseCase$execute$1;
        java.lang.Long l4;
        java.lang.Long l5;
        long j2;
        boolean z3;
        OKConversation oKConversation2;
        oEH oeh;
        java.lang.Long l6;
        boolean z4;
        oEH oeh2;
        boolean z5;
        long j3;
        java.lang.Long l7;
        oEH oeh3;
        java.util.Collection arrayList;
        java.lang.Long l8;
        java.util.Iterator it;
        boolean z6 = z2;
        if (continuation instanceof GetMessageListUseCase$execute$1) {
            getMessageListUseCase$execute$1 = (GetMessageListUseCase$execute$1) continuation;
            int i = getMessageListUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMessageListUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMessageListUseCase$execute$1 = new GetMessageListUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getMessageListUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMessageListUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (!z6) {
                oCA oca = this.AEQbTJ;
                getMessageListUseCase$execute$1.L$0 = this;
                getMessageListUseCase$execute$1.L$1 = oKConversation;
                l6 = l2;
                getMessageListUseCase$execute$1.L$2 = l6;
                l4 = l3;
                getMessageListUseCase$execute$1.L$3 = l4;
                getMessageListUseCase$execute$1.J$0 = j;
                z4 = z;
                getMessageListUseCase$execute$1.Z$0 = z4;
                getMessageListUseCase$execute$1.Z$1 = z6;
                getMessageListUseCase$execute$1.label = 1;
                if (oca.copydefault(getMessageListUseCase$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                oeh2 = this;
                z5 = z6;
                j3 = j;
                oKConversation2 = oKConversation;
            } else {
                l4 = l3;
                l5 = l2;
                j2 = j;
                z3 = z;
                oKConversation2 = oKConversation;
                oeh = this;
                pUU.KWHzl("GetMessageListUseCase", "[" + oKConversation2.getTargetId() + "] actualIsLoadMoreWithSchedule=" + z6);
                sNO sno = new sNO(oKConversation2.getTargetId(), l5, j2, null, z3, 0, z6, 32, null);
                sKH skh = oeh.OLrzqt;
                getMessageListUseCase$execute$1.L$0 = oeh;
                getMessageListUseCase$execute$1.L$1 = l4;
                getMessageListUseCase$execute$1.L$2 = null;
                getMessageListUseCase$execute$1.L$3 = null;
                getMessageListUseCase$execute$1.label = 2;
                objKWHzl = skh.KWHzl(sno, getMessageListUseCase$execute$1);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                l7 = l4;
                java.util.List list = (java.util.List) objKWHzl;
                pUU.KWHzl("GetMessageListUseCase", "Result => size = " + list.size() + ", firstMsgSeq=" + CollectionsKt___CollectionsKt.firstOrNull(list));
                oeh3 = oeh;
                arrayList = new java.util.ArrayList();
                l8 = l7;
                it = list.iterator();
                if (!it.hasNext()) {
                }
            }
        } else if (i2 == 1) {
            boolean z7 = getMessageListUseCase$execute$1.Z$1;
            boolean z8 = getMessageListUseCase$execute$1.Z$0;
            long j4 = getMessageListUseCase$execute$1.J$0;
            l4 = (java.lang.Long) getMessageListUseCase$execute$1.L$3;
            java.lang.Long l9 = (java.lang.Long) getMessageListUseCase$execute$1.L$2;
            oKConversation2 = (OKConversation) getMessageListUseCase$execute$1.L$1;
            oEH oeh4 = (oEH) getMessageListUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            z5 = z7;
            j3 = j4;
            l6 = l9;
            oeh2 = oeh4;
            z4 = z8;
        } else if (i2 == 2) {
            l7 = (java.lang.Long) getMessageListUseCase$execute$1.L$1;
            oeh = (oEH) getMessageListUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.List list2 = (java.util.List) objKWHzl;
            pUU.KWHzl("GetMessageListUseCase", "Result => size = " + list2.size() + ", firstMsgSeq=" + CollectionsKt___CollectionsKt.firstOrNull(list2));
            oeh3 = oeh;
            arrayList = new java.util.ArrayList();
            l8 = l7;
            it = list2.iterator();
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) getMessageListUseCase$execute$1.L$3;
            arrayList = (java.util.Collection) getMessageListUseCase$execute$1.L$2;
            l8 = (java.lang.Long) getMessageListUseCase$execute$1.L$1;
            oeh3 = (oEH) getMessageListUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            OKMessage oKMessage = (OKMessage) objKWHzl;
            if (oKMessage != null) {
                arrayList.add(oKMessage);
            }
            if (!it.hasNext()) {
                OKMessage oKMessage2 = (OKMessage) it.next();
                C35847oFx c35847oFx = oeh3.KWHzl;
                getMessageListUseCase$execute$1.L$0 = oeh3;
                getMessageListUseCase$execute$1.L$1 = l8;
                getMessageListUseCase$execute$1.L$2 = arrayList;
                getMessageListUseCase$execute$1.L$3 = it;
                getMessageListUseCase$execute$1.label = 3;
                objKWHzl = c35847oFx.EZpvd(oKMessage2, (28 & 2) != 0 ? null : l8, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null, getMessageListUseCase$execute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                OKMessage oKMessage3 = (OKMessage) objKWHzl;
                if (oKMessage3 != null) {
                }
                if (!it.hasNext()) {
                    return CollectionsKt___CollectionsKt.EZpvd((java.util.List) arrayList, new StateListAnimator());
                }
            }
        }
        j2 = j3;
        z6 = z5;
        oeh = oeh2;
        l5 = l6;
        z3 = z4;
        pUU.KWHzl("GetMessageListUseCase", "[" + oKConversation2.getTargetId() + "] actualIsLoadMoreWithSchedule=" + z6);
        sNO sno2 = new sNO(oKConversation2.getTargetId(), l5, j2, null, z3, 0, z6, 32, null);
        sKH skh2 = oeh.OLrzqt;
        getMessageListUseCase$execute$1.L$0 = oeh;
        getMessageListUseCase$execute$1.L$1 = l4;
        getMessageListUseCase$execute$1.L$2 = null;
        getMessageListUseCase$execute$1.L$3 = null;
        getMessageListUseCase$execute$1.label = 2;
        objKWHzl = skh2.KWHzl(sno2, getMessageListUseCase$execute$1);
        if (objKWHzl != objCopydefault) {
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((OKMessage) t).getSentTime()), java.lang.Long.valueOf(((OKMessage) t2).getSentTime()));
        }
    }
}
