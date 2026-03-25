package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionUpdateTime;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionBySeqRequest;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetUpdateReactionTimeBySeq;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetUpdateReactionTimeResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import com.okinc.okimcore.usecase.QueryReactionTimeUseCase$invoke$1;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44504sSg {
    public final C44486sRp AEQbTJ;
    public final C44489sRs EZpvd;
    public final C44501sSd OLrzqt;

    @yCM
    public C44504sSg(@NotNull C44489sRs c44489sRs, @NotNull C44486sRp c44486sRp, @NotNull C44501sSd c44501sSd) {
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        Intrinsics.checkNotNullParameter(c44501sSd, "");
        this.EZpvd = c44489sRs;
        this.AEQbTJ = c44486sRp;
        this.OLrzqt = c44501sSd;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x002c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x0270 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x008b */
    /* JADX DEBUG: Type inference failed for r0v21. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6 A[Catch: all -> 0x0275, TryCatch #0 {all -> 0x0275, blocks: (B:15:0x003b, B:85:0x024f, B:86:0x025a, B:88:0x0260, B:90:0x026c, B:91:0x0270, B:82:0x023c, B:42:0x00d5, B:43:0x00e0, B:45:0x00e6, B:47:0x00f4, B:48:0x00f8, B:49:0x0107, B:51:0x010d, B:52:0x011f, B:53:0x013a, B:55:0x0140, B:56:0x0166, B:57:0x0173, B:59:0x0179, B:61:0x0191, B:63:0x01a9, B:67:0x01b8, B:71:0x01e8, B:74:0x01f7, B:76:0x0200, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:31:0x0091), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x0275, LOOP:1: B:49:0x0107->B:51:0x010d, LOOP_END, TryCatch #0 {all -> 0x0275, blocks: (B:15:0x003b, B:85:0x024f, B:86:0x025a, B:88:0x0260, B:90:0x026c, B:91:0x0270, B:82:0x023c, B:42:0x00d5, B:43:0x00e0, B:45:0x00e6, B:47:0x00f4, B:48:0x00f8, B:49:0x0107, B:51:0x010d, B:52:0x011f, B:53:0x013a, B:55:0x0140, B:56:0x0166, B:57:0x0173, B:59:0x0179, B:61:0x0191, B:63:0x01a9, B:67:0x01b8, B:71:0x01e8, B:74:0x01f7, B:76:0x0200, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:31:0x0091), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140 A[Catch: all -> 0x0275, LOOP:2: B:53:0x013a->B:55:0x0140, LOOP_END, TryCatch #0 {all -> 0x0275, blocks: (B:15:0x003b, B:85:0x024f, B:86:0x025a, B:88:0x0260, B:90:0x026c, B:91:0x0270, B:82:0x023c, B:42:0x00d5, B:43:0x00e0, B:45:0x00e6, B:47:0x00f4, B:48:0x00f8, B:49:0x0107, B:51:0x010d, B:52:0x011f, B:53:0x013a, B:55:0x0140, B:56:0x0166, B:57:0x0173, B:59:0x0179, B:61:0x0191, B:63:0x01a9, B:67:0x01b8, B:71:0x01e8, B:74:0x01f7, B:76:0x0200, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:31:0x0091), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179 A[Catch: all -> 0x0275, TryCatch #0 {all -> 0x0275, blocks: (B:15:0x003b, B:85:0x024f, B:86:0x025a, B:88:0x0260, B:90:0x026c, B:91:0x0270, B:82:0x023c, B:42:0x00d5, B:43:0x00e0, B:45:0x00e6, B:47:0x00f4, B:48:0x00f8, B:49:0x0107, B:51:0x010d, B:52:0x011f, B:53:0x013a, B:55:0x0140, B:56:0x0166, B:57:0x0173, B:59:0x0179, B:61:0x0191, B:63:0x01a9, B:67:0x01b8, B:71:0x01e8, B:74:0x01f7, B:76:0x0200, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:31:0x0091), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e8 A[Catch: all -> 0x0275, TryCatch #0 {all -> 0x0275, blocks: (B:15:0x003b, B:85:0x024f, B:86:0x025a, B:88:0x0260, B:90:0x026c, B:91:0x0270, B:82:0x023c, B:42:0x00d5, B:43:0x00e0, B:45:0x00e6, B:47:0x00f4, B:48:0x00f8, B:49:0x0107, B:51:0x010d, B:52:0x011f, B:53:0x013a, B:55:0x0140, B:56:0x0166, B:57:0x0173, B:59:0x0179, B:61:0x0191, B:63:0x01a9, B:67:0x01b8, B:71:0x01e8, B:74:0x01f7, B:76:0x0200, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:31:0x0091), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0200 A[Catch: all -> 0x0275, TryCatch #0 {all -> 0x0275, blocks: (B:15:0x003b, B:85:0x024f, B:86:0x025a, B:88:0x0260, B:90:0x026c, B:91:0x0270, B:82:0x023c, B:42:0x00d5, B:43:0x00e0, B:45:0x00e6, B:47:0x00f4, B:48:0x00f8, B:49:0x0107, B:51:0x010d, B:52:0x011f, B:53:0x013a, B:55:0x0140, B:56:0x0166, B:57:0x0173, B:59:0x0179, B:61:0x0191, B:63:0x01a9, B:67:0x01b8, B:71:0x01e8, B:74:0x01f7, B:76:0x0200, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:31:0x0091), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0260 A[Catch: all -> 0x0275, TryCatch #0 {all -> 0x0275, blocks: (B:15:0x003b, B:85:0x024f, B:86:0x025a, B:88:0x0260, B:90:0x026c, B:91:0x0270, B:82:0x023c, B:42:0x00d5, B:43:0x00e0, B:45:0x00e6, B:47:0x00f4, B:48:0x00f8, B:49:0x0107, B:51:0x010d, B:52:0x011f, B:53:0x013a, B:55:0x0140, B:56:0x0166, B:57:0x0173, B:59:0x0179, B:61:0x0191, B:63:0x01a9, B:67:0x01b8, B:71:0x01e8, B:74:0x01f7, B:76:0x0200, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:31:0x0091), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0288  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Result<? extends java.util.List<OKMessage>>> continuation) {
        QueryReactionTimeUseCase$invoke$1 queryReactionTimeUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        ?? r2;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C44504sSg c44504sSg;
        java.lang.Object obj;
        WSGetUpdateReactionTimeResponse wSGetUpdateReactionTimeResponse;
        java.lang.String str2;
        java.lang.Object obj2;
        java.util.List<java.lang.Long> list2;
        C44504sSg c44504sSg2;
        java.util.List arrayList;
        java.util.Iterator it;
        java.util.List<java.lang.Long> list3;
        java.lang.String str3;
        java.lang.String str4;
        java.util.Iterator it2;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.lang.Long lKWHzl;
        java.util.ArrayList arrayList4;
        java.lang.String str5 = str;
        java.util.List<java.lang.Long> list4 = list;
        if (continuation instanceof QueryReactionTimeUseCase$invoke$1) {
            queryReactionTimeUseCase$invoke$1 = (QueryReactionTimeUseCase$invoke$1) continuation;
            int i = queryReactionTimeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                queryReactionTimeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                queryReactionTimeUseCase$invoke$1 = new QueryReactionTimeUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = queryReactionTimeUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r6 = queryReactionTimeUseCase$invoke$1.label;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
            r6 = str5;
        }
        if (r6 != 0) {
            try {
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r2 = r6;
            }
            if (r6 != 1) {
                if (r6 != 2) {
                    if (r6 != 3) {
                        if (r6 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.String str6 = (java.lang.String) queryReactionTimeUseCase$invoke$1.L$0;
                        C56391yDq.AEQbTJ(objEZpvd);
                        str5 = str6;
                        arrayList = new java.util.ArrayList();
                        it = ((java.util.List) objEZpvd).iterator();
                        while (it.hasNext()) {
                            OKMessage oKMessageOLrzqt = C44169sFw.OLrzqt((InHouseIMMessageWithReactions) it.next());
                            if (oKMessageOLrzqt != null) {
                                arrayList.add(oKMessageOLrzqt);
                            }
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                        r2 = str5;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            C44124sEe.AEQbTJ("Reaction synchronization failed: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl, (java.lang.String) r2);
                        }
                        return objM7377constructorimpl;
                    }
                    list2 = (java.util.List) queryReactionTimeUseCase$invoke$1.L$2;
                    c44504sSg2 = (C44504sSg) queryReactionTimeUseCase$invoke$1.L$1;
                    java.lang.String str7 = (java.lang.String) queryReactionTimeUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    ((Result) objEZpvd).m7386unboximpl();
                    str4 = str7;
                    list3 = list2;
                    c44504sSg = c44504sSg2;
                    str3 = str4;
                    C44486sRp c44486sRp = c44504sSg.AEQbTJ;
                    queryReactionTimeUseCase$invoke$1.L$0 = str3;
                    queryReactionTimeUseCase$invoke$1.L$1 = null;
                    queryReactionTimeUseCase$invoke$1.L$2 = null;
                    queryReactionTimeUseCase$invoke$1.label = 4;
                    objEZpvd = c44486sRp.EZpvd(str3, list3, queryReactionTimeUseCase$invoke$1);
                    str5 = str3;
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    arrayList = new java.util.ArrayList();
                    it = ((java.util.List) objEZpvd).iterator();
                    while (it.hasNext()) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                    r2 = str5;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return objM7377constructorimpl;
                }
                wSGetUpdateReactionTimeResponse = (WSGetUpdateReactionTimeResponse) queryReactionTimeUseCase$invoke$1.L$2;
                C44504sSg c44504sSg3 = (C44504sSg) queryReactionTimeUseCase$invoke$1.L$1;
                java.lang.String str8 = (java.lang.String) queryReactionTimeUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c44504sSg = c44504sSg3;
                str2 = str8;
                obj2 = objEZpvd;
                java.util.ArrayList<InHouseIMMessageEntity> arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj3 : (java.lang.Iterable) obj2) {
                    if (!((InHouseIMMessageEntity) obj3).isRecalled()) {
                        arrayList5.add(obj3);
                    }
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
                it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(C56443yFo.KWHzl(((InHouseIMMessageEntity) it2.next()).getSeq()));
                }
                java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList6);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList5, 10)), 16));
                for (InHouseIMMessageEntity inHouseIMMessageEntity : arrayList5) {
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(inHouseIMMessageEntity.getSeq()), C56443yFo.KWHzl(inHouseIMMessageEntity.getReactionUpdateTime()));
                    linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                }
                java.util.List<ReactionUpdateTime> reactionUpdateTimeList = wSGetUpdateReactionTimeResponse.getReactionUpdateTimeList();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                for (ReactionUpdateTime reactionUpdateTime : reactionUpdateTimeList) {
                    long jValueOf = C33129mqd.valueOf(reactionUpdateTime.getSeq());
                    if (setOqFWZa.contains(C56443yFo.KWHzl(jValueOf))) {
                        long jValueOf2 = C33129mqd.valueOf(C56443yFo.KWHzl(reactionUpdateTime.getUpdateTime()));
                        java.lang.Long l = (java.lang.Long) linkedHashMap.get(C56443yFo.KWHzl(jValueOf));
                        arrayList3 = arrayList7;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        if (jValueOf2 > jLongValue) {
                            C44124sEe.imLogSync$default("Message " + jValueOf + " requires reaction update: remote time " + jValueOf2 + " > local time " + jLongValue, null, str2, 2, null);
                            lKWHzl = C56443yFo.KWHzl(jValueOf);
                        }
                        if (lKWHzl == null) {
                            arrayList4 = arrayList3;
                            arrayList4.add(lKWHzl);
                        } else {
                            arrayList4 = arrayList3;
                        }
                        arrayList7 = arrayList4;
                    } else {
                        arrayList3 = arrayList7;
                    }
                    lKWHzl = null;
                    if (lKWHzl == null) {
                    }
                    arrayList7 = arrayList4;
                }
                arrayList2 = arrayList7;
                if (!(!arrayList2.isEmpty())) {
                    C44124sEe.imLogSync$default("Identified " + arrayList2.size() + " messages requiring reaction updates: " + arrayList2, null, str2, 2, null);
                    C44501sSd c44501sSd = c44504sSg.OLrzqt;
                    queryReactionTimeUseCase$invoke$1.L$0 = str2;
                    queryReactionTimeUseCase$invoke$1.L$1 = c44504sSg;
                    queryReactionTimeUseCase$invoke$1.L$2 = arrayList2;
                    queryReactionTimeUseCase$invoke$1.label = 3;
                    if (c44501sSd.EZpvd(str2, arrayList2, queryReactionTimeUseCase$invoke$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    c44504sSg2 = c44504sSg;
                    list2 = arrayList2;
                    list3 = list2;
                    c44504sSg = c44504sSg2;
                    str3 = str4;
                    C44486sRp c44486sRp2 = c44504sSg.AEQbTJ;
                    queryReactionTimeUseCase$invoke$1.L$0 = str3;
                    queryReactionTimeUseCase$invoke$1.L$1 = null;
                    queryReactionTimeUseCase$invoke$1.L$2 = null;
                    queryReactionTimeUseCase$invoke$1.label = 4;
                    objEZpvd = c44486sRp2.EZpvd(str3, list3, queryReactionTimeUseCase$invoke$1);
                    str5 = str3;
                    if (objEZpvd == objCopydefault) {
                    }
                    arrayList = new java.util.ArrayList();
                    it = ((java.util.List) objEZpvd).iterator();
                    while (it.hasNext()) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                    r2 = str5;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return objM7377constructorimpl;
                }
                list3 = arrayList2;
                str3 = str2;
                C44486sRp c44486sRp22 = c44504sSg.AEQbTJ;
                queryReactionTimeUseCase$invoke$1.L$0 = str3;
                queryReactionTimeUseCase$invoke$1.L$1 = null;
                queryReactionTimeUseCase$invoke$1.L$2 = null;
                queryReactionTimeUseCase$invoke$1.label = 4;
                objEZpvd = c44486sRp22.EZpvd(str3, list3, queryReactionTimeUseCase$invoke$1);
                str5 = str3;
                if (objEZpvd == objCopydefault) {
                }
                arrayList = new java.util.ArrayList();
                it = ((java.util.List) objEZpvd).iterator();
                while (it.hasNext()) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                r2 = str5;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return objM7377constructorimpl;
            }
            C44504sSg c44504sSg4 = (C44504sSg) queryReactionTimeUseCase$invoke$1.L$2;
            java.util.List<java.lang.Long> list5 = (java.util.List) queryReactionTimeUseCase$invoke$1.L$1;
            java.lang.String str9 = (java.lang.String) queryReactionTimeUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            c44504sSg = c44504sSg4;
            list4 = list5;
            str5 = str9;
            obj = objEZpvd;
        } else {
            C56391yDq.AEQbTJ(objEZpvd);
            Result.Application application2 = Result.Companion;
            this.EZpvd.OLrzqt();
            WSGetUpdateReactionTimeBySeq wSGetUpdateReactionTimeBySeq = new WSGetUpdateReactionTimeBySeq(new WSGetReactionBySeqRequest(str5, list4));
            C44489sRs c44489sRs = this.EZpvd;
            queryReactionTimeUseCase$invoke$1.L$0 = str5;
            queryReactionTimeUseCase$invoke$1.L$1 = list4;
            queryReactionTimeUseCase$invoke$1.L$2 = this;
            queryReactionTimeUseCase$invoke$1.label = 1;
            java.lang.Object objCopydefault2 = c44489sRs.copydefault(wSGetUpdateReactionTimeBySeq, (Continuation<? super WSGetUpdateReactionTimeResponse>) queryReactionTimeUseCase$invoke$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            c44504sSg = this;
            str5 = str5;
        }
        WSGetUpdateReactionTimeResponse wSGetUpdateReactionTimeResponse2 = (WSGetUpdateReactionTimeResponse) obj;
        if (wSGetUpdateReactionTimeResponse2 == null) {
            arrayList = yDY.AhwBna();
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
            r2 = str5;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return objM7377constructorimpl;
        }
        C44486sRp c44486sRp3 = c44504sSg.AEQbTJ;
        queryReactionTimeUseCase$invoke$1.L$0 = str5;
        queryReactionTimeUseCase$invoke$1.L$1 = c44504sSg;
        queryReactionTimeUseCase$invoke$1.L$2 = wSGetUpdateReactionTimeResponse2;
        queryReactionTimeUseCase$invoke$1.label = 2;
        java.lang.Object objAEQbTJ = c44486sRp3.AEQbTJ(str5, list4, queryReactionTimeUseCase$invoke$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objAEQbTJ;
        wSGetUpdateReactionTimeResponse = wSGetUpdateReactionTimeResponse2;
        str2 = str5;
        java.util.ArrayList<InHouseIMMessageEntity> arrayList52 = new java.util.ArrayList();
        while (r6.hasNext()) {
        }
        java.util.ArrayList arrayList62 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList52, 10));
        it2 = arrayList52.iterator();
        while (it2.hasNext()) {
        }
        java.util.Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(arrayList62);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList52, 10)), 16));
        while (r12.hasNext()) {
        }
        java.util.List<ReactionUpdateTime> reactionUpdateTimeList2 = wSGetUpdateReactionTimeResponse.getReactionUpdateTimeList();
        java.util.ArrayList arrayList72 = new java.util.ArrayList();
        while (r0.hasNext()) {
        }
        arrayList2 = arrayList72;
        if (!(!arrayList2.isEmpty())) {
        }
    }
}
