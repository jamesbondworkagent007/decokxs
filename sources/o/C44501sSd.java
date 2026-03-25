package o;

import com.okinc.okimcore.model.im.inhouseim.ws.Reaction;
import com.okinc.okimcore.model.im.inhouseim.ws.UserUid;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionBySeq;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionBySeqRequest;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse;
import com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity;
import com.okinc.okimcore.usecase.SyncMessageReactionUseCase$invoke$1;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44501sSd {
    public final sMF EZpvd;
    public final C44486sRp KWHzl;
    public final C44489sRs copydefault;

    @yCM
    public C44501sSd(@NotNull C44489sRs c44489sRs, @NotNull sMF smf, @NotNull C44486sRp c44486sRp) {
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        Intrinsics.checkNotNullParameter(smf, "");
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        this.copydefault = c44489sRs;
        this.EZpvd = smf;
        this.KWHzl = c44486sRp;
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00ba: MOVE (r8 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:30:0x00ba */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142 A[Catch: all -> 0x0339, TryCatch #3 {all -> 0x0339, blocks: (B:85:0x0271, B:51:0x013c, B:53:0x0142, B:57:0x016e, B:59:0x0172, B:62:0x017a, B:65:0x0194, B:68:0x01bc, B:70:0x01c6, B:71:0x01e6, B:72:0x01f3, B:74:0x01f9, B:75:0x0214, B:77:0x021a, B:78:0x0247, B:79:0x024e, B:81:0x0256, B:88:0x029e, B:90:0x02ca, B:91:0x02d7, B:93:0x02dd, B:95:0x02ee, B:96:0x02f2, B:97:0x030b, B:99:0x0311, B:101:0x0334, B:47:0x0122, B:49:0x0126, B:50:0x012c, B:43:0x00ff), top: B:115:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c6 A[Catch: all -> 0x0339, TryCatch #3 {all -> 0x0339, blocks: (B:85:0x0271, B:51:0x013c, B:53:0x0142, B:57:0x016e, B:59:0x0172, B:62:0x017a, B:65:0x0194, B:68:0x01bc, B:70:0x01c6, B:71:0x01e6, B:72:0x01f3, B:74:0x01f9, B:75:0x0214, B:77:0x021a, B:78:0x0247, B:79:0x024e, B:81:0x0256, B:88:0x029e, B:90:0x02ca, B:91:0x02d7, B:93:0x02dd, B:95:0x02ee, B:96:0x02f2, B:97:0x030b, B:99:0x0311, B:101:0x0334, B:47:0x0122, B:49:0x0126, B:50:0x012c, B:43:0x00ff), top: B:115:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6 A[Catch: all -> 0x0339, TryCatch #3 {all -> 0x0339, blocks: (B:85:0x0271, B:51:0x013c, B:53:0x0142, B:57:0x016e, B:59:0x0172, B:62:0x017a, B:65:0x0194, B:68:0x01bc, B:70:0x01c6, B:71:0x01e6, B:72:0x01f3, B:74:0x01f9, B:75:0x0214, B:77:0x021a, B:78:0x0247, B:79:0x024e, B:81:0x0256, B:88:0x029e, B:90:0x02ca, B:91:0x02d7, B:93:0x02dd, B:95:0x02ee, B:96:0x02f2, B:97:0x030b, B:99:0x0311, B:101:0x0334, B:47:0x0122, B:49:0x0126, B:50:0x012c, B:43:0x00ff), top: B:115:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ca A[Catch: all -> 0x0339, TryCatch #3 {all -> 0x0339, blocks: (B:85:0x0271, B:51:0x013c, B:53:0x0142, B:57:0x016e, B:59:0x0172, B:62:0x017a, B:65:0x0194, B:68:0x01bc, B:70:0x01c6, B:71:0x01e6, B:72:0x01f3, B:74:0x01f9, B:75:0x0214, B:77:0x021a, B:78:0x0247, B:79:0x024e, B:81:0x0256, B:88:0x029e, B:90:0x02ca, B:91:0x02d7, B:93:0x02dd, B:95:0x02ee, B:96:0x02f2, B:97:0x030b, B:99:0x0311, B:101:0x0334, B:47:0x0122, B:49:0x0126, B:50:0x012c, B:43:0x00ff), top: B:115:0x00ff }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0165 -> B:34:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Result<? extends java.util.Map<java.lang.Long, ? extends java.util.List<Reaction>>>> continuation) throws java.lang.Throwable {
        SyncMessageReactionUseCase$invoke$1 syncMessageReactionUseCase$invoke$1;
        C44501sSd c44501sSd;
        WSGetReactionResponse wSGetReactionResponse;
        java.lang.String strCopydefault;
        java.util.Iterator it;
        java.util.Map mapKWHzl;
        java.util.List<EmojiReactionEntity> arrayList;
        boolean z;
        WSGetReactionResponse wSGetReactionResponse2;
        C44501sSd c44501sSd2;
        WSSendReactionResponse wSSendReactionResponse;
        java.util.Iterator it2;
        java.lang.String str2;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.util.Iterator it3;
        WSGetReactionResponse wSGetReactionResponse3;
        C44501sSd c44501sSd3;
        java.lang.String str3;
        java.lang.Throwable th2;
        int i;
        java.util.Iterator it4;
        java.lang.String str4;
        C44486sRp c44486sRp;
        long jEZpvd;
        long jKWHzl;
        sMF smf;
        java.lang.String str5;
        java.lang.String str6 = str;
        if (continuation instanceof SyncMessageReactionUseCase$invoke$1) {
            syncMessageReactionUseCase$invoke$1 = (SyncMessageReactionUseCase$invoke$1) continuation;
            int i2 = syncMessageReactionUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncMessageReactionUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncMessageReactionUseCase$invoke$1 = new SyncMessageReactionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = syncMessageReactionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = syncMessageReactionUseCase$invoke$1.label;
        boolean z2 = true;
        int i4 = 2;
        java.lang.Throwable th3 = null;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                this.copydefault.OLrzqt();
                WSGetReactionBySeq wSGetReactionBySeq = new WSGetReactionBySeq(new WSGetReactionBySeqRequest(str6, list));
                C44489sRs c44489sRs = this.copydefault;
                syncMessageReactionUseCase$invoke$1.L$0 = str6;
                syncMessageReactionUseCase$invoke$1.L$1 = this;
                syncMessageReactionUseCase$invoke$1.label = 1;
                objEZpvd = c44489sRs.EZpvd(wSGetReactionBySeq, syncMessageReactionUseCase$invoke$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c44501sSd = this;
            } catch (java.lang.Throwable th4) {
                th = th4;
                str2 = str6;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str6 = str2;
            }
        } else {
            if (i3 == 1) {
                C44501sSd c44501sSd4 = (C44501sSd) syncMessageReactionUseCase$invoke$1.L$1;
                java.lang.String str7 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    c44501sSd = c44501sSd4;
                    str6 = str7;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    str2 = str7;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    str6 = str2;
                }
            } else if (i3 != 2) {
                try {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str2 = str5;
                }
                if (i3 == 3) {
                    java.lang.String str8 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$6;
                    wSSendReactionResponse = (WSSendReactionResponse) syncMessageReactionUseCase$invoke$1.L$5;
                    it4 = (java.util.Iterator) syncMessageReactionUseCase$invoke$1.L$4;
                    wSGetReactionResponse3 = (WSGetReactionResponse) syncMessageReactionUseCase$invoke$1.L$3;
                    str3 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$2;
                    c44501sSd3 = (C44501sSd) syncMessageReactionUseCase$invoke$1.L$1;
                    java.lang.String str9 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    str4 = str8;
                    str6 = str9;
                    c44486sRp = c44501sSd3.KWHzl;
                    jEZpvd = wSSendReactionResponse.EZpvd();
                    jKWHzl = wSSendReactionResponse.KWHzl();
                    syncMessageReactionUseCase$invoke$1.L$0 = str6;
                    syncMessageReactionUseCase$invoke$1.L$1 = c44501sSd3;
                    syncMessageReactionUseCase$invoke$1.L$2 = str3;
                    syncMessageReactionUseCase$invoke$1.L$3 = wSGetReactionResponse3;
                    syncMessageReactionUseCase$invoke$1.L$4 = it4;
                    syncMessageReactionUseCase$invoke$1.L$5 = wSSendReactionResponse;
                    syncMessageReactionUseCase$invoke$1.L$6 = str4;
                    syncMessageReactionUseCase$invoke$1.label = 4;
                    if (c44486sRp.copydefault(str6, jEZpvd, jKWHzl, syncMessageReactionUseCase$invoke$1) == objCopydefault) {
                    }
                    java.lang.String str10 = str3;
                    it2 = it4;
                    strCopydefault = str10;
                    C44501sSd c44501sSd5 = c44501sSd3;
                    wSGetReactionResponse2 = wSGetReactionResponse3;
                    c44501sSd2 = c44501sSd5;
                    if (wSSendReactionResponse.KWHzl() != 0) {
                    }
                    wSGetReactionResponse = wSGetReactionResponse2;
                    i = 2;
                    th2 = null;
                    i4 = i;
                    c44501sSd = c44501sSd2;
                    it = it2;
                    th3 = th2;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else if (i3 == 4) {
                    java.lang.String str11 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$6;
                    wSSendReactionResponse = (WSSendReactionResponse) syncMessageReactionUseCase$invoke$1.L$5;
                    it4 = (java.util.Iterator) syncMessageReactionUseCase$invoke$1.L$4;
                    wSGetReactionResponse3 = (WSGetReactionResponse) syncMessageReactionUseCase$invoke$1.L$3;
                    str3 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$2;
                    c44501sSd3 = (C44501sSd) syncMessageReactionUseCase$invoke$1.L$1;
                    java.lang.String str12 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    str4 = str11;
                    str6 = str12;
                    java.lang.String str102 = str3;
                    it2 = it4;
                    strCopydefault = str102;
                    C44501sSd c44501sSd52 = c44501sSd3;
                    wSGetReactionResponse2 = wSGetReactionResponse3;
                    c44501sSd2 = c44501sSd52;
                    if (wSSendReactionResponse.KWHzl() != 0) {
                    }
                    wSGetReactionResponse = wSGetReactionResponse2;
                    i = 2;
                    th2 = null;
                    i4 = i;
                    c44501sSd = c44501sSd2;
                    it = it2;
                    th3 = th2;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i3 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List<EmojiReactionEntity> list2 = (java.util.List) syncMessageReactionUseCase$invoke$1.L$6;
                    wSSendReactionResponse = (WSSendReactionResponse) syncMessageReactionUseCase$invoke$1.L$5;
                    java.util.Iterator it5 = (java.util.Iterator) syncMessageReactionUseCase$invoke$1.L$4;
                    wSGetReactionResponse2 = (WSGetReactionResponse) syncMessageReactionUseCase$invoke$1.L$3;
                    strCopydefault = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$2;
                    c44501sSd2 = (C44501sSd) syncMessageReactionUseCase$invoke$1.L$1;
                    str2 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objEZpvd);
                        z = true;
                        arrayList = list2;
                        str6 = str2;
                        C44124sEe.imLogSync$default("Inserted " + arrayList.size() + " new reactions for message " + wSSendReactionResponse.EZpvd(), null, str6, 2, null);
                        it2 = it5;
                        wSGetReactionResponse = wSGetReactionResponse2;
                        i = 2;
                        th2 = null;
                        i4 = i;
                        c44501sSd = c44501sSd2;
                        it = it2;
                        th3 = th2;
                        z2 = z;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        Result.Application application222 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        str6 = str2;
                    }
                    if (it.hasNext()) {
                        WSSendReactionResponse wSSendReactionResponse2 = (WSSendReactionResponse) it.next();
                        C44486sRp c44486sRp2 = c44501sSd.KWHzl;
                        long jEZpvd2 = wSSendReactionResponse2.EZpvd();
                        syncMessageReactionUseCase$invoke$1.L$0 = str6;
                        syncMessageReactionUseCase$invoke$1.L$1 = c44501sSd;
                        syncMessageReactionUseCase$invoke$1.L$2 = strCopydefault;
                        syncMessageReactionUseCase$invoke$1.L$3 = wSGetReactionResponse;
                        syncMessageReactionUseCase$invoke$1.L$4 = it;
                        syncMessageReactionUseCase$invoke$1.L$5 = wSSendReactionResponse2;
                        syncMessageReactionUseCase$invoke$1.L$6 = th3;
                        syncMessageReactionUseCase$invoke$1.label = i4;
                        java.lang.Object objEZpvd2 = c44486sRp2.EZpvd(str6, jEZpvd2, syncMessageReactionUseCase$invoke$1);
                        if (objEZpvd2 == objCopydefault) {
                            return objCopydefault;
                        }
                        it3 = it;
                        wSGetReactionResponse3 = wSGetReactionResponse;
                        objEZpvd = objEZpvd2;
                        c44501sSd3 = c44501sSd;
                        wSSendReactionResponse = wSSendReactionResponse2;
                        str3 = strCopydefault;
                        it4 = it3;
                        str4 = (java.lang.String) objEZpvd;
                        if (str4 != null && str4.length() != 0) {
                            smf = c44501sSd3.EZpvd;
                            syncMessageReactionUseCase$invoke$1.L$0 = str6;
                            syncMessageReactionUseCase$invoke$1.L$1 = c44501sSd3;
                            syncMessageReactionUseCase$invoke$1.L$2 = str3;
                            syncMessageReactionUseCase$invoke$1.L$3 = wSGetReactionResponse3;
                            syncMessageReactionUseCase$invoke$1.L$4 = it4;
                            syncMessageReactionUseCase$invoke$1.L$5 = wSSendReactionResponse;
                            syncMessageReactionUseCase$invoke$1.L$6 = str4;
                            syncMessageReactionUseCase$invoke$1.label = 3;
                            if (smf.copydefault(str4, syncMessageReactionUseCase$invoke$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            c44486sRp = c44501sSd3.KWHzl;
                            jEZpvd = wSSendReactionResponse.EZpvd();
                            jKWHzl = wSSendReactionResponse.KWHzl();
                            syncMessageReactionUseCase$invoke$1.L$0 = str6;
                            syncMessageReactionUseCase$invoke$1.L$1 = c44501sSd3;
                            syncMessageReactionUseCase$invoke$1.L$2 = str3;
                            syncMessageReactionUseCase$invoke$1.L$3 = wSGetReactionResponse3;
                            syncMessageReactionUseCase$invoke$1.L$4 = it4;
                            syncMessageReactionUseCase$invoke$1.L$5 = wSSendReactionResponse;
                            syncMessageReactionUseCase$invoke$1.L$6 = str4;
                            syncMessageReactionUseCase$invoke$1.label = 4;
                            if (c44486sRp.copydefault(str6, jEZpvd, jKWHzl, syncMessageReactionUseCase$invoke$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            java.lang.String str1022 = str3;
                            it2 = it4;
                            strCopydefault = str1022;
                            C44501sSd c44501sSd522 = c44501sSd3;
                            wSGetReactionResponse2 = wSGetReactionResponse3;
                            c44501sSd2 = c44501sSd522;
                            if (wSSendReactionResponse.KWHzl() != 0) {
                                C44124sEe.imLogSync$default("Cleared all reactions for message " + wSSendReactionResponse.EZpvd() + " due to updateTime=0", th3, str6, i4, th3);
                                z = true;
                            } else {
                                java.util.List<Reaction> listCopydefault = wSSendReactionResponse.copydefault();
                                arrayList = new java.util.ArrayList<>();
                                for (Reaction reaction : listCopydefault) {
                                    java.util.List<UserUid> listAEQbTJ = reaction.AEQbTJ();
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                                    for (UserUid userUid : listAEQbTJ) {
                                        arrayList2.add(new EmojiReactionEntity(0L, str4, reaction.copydefault(), userUid.EZpvd(), userUid.OLrzqt(), Intrinsics.EZpvd((java.lang.Object) userUid.OLrzqt(), (java.lang.Object) strCopydefault), 1, null));
                                    }
                                    C56406yEe.KWHzl(arrayList, arrayList2);
                                }
                                z = true;
                                if (!arrayList.isEmpty()) {
                                    sMF smf2 = c44501sSd2.EZpvd;
                                    syncMessageReactionUseCase$invoke$1.L$0 = str6;
                                    syncMessageReactionUseCase$invoke$1.L$1 = c44501sSd2;
                                    syncMessageReactionUseCase$invoke$1.L$2 = strCopydefault;
                                    syncMessageReactionUseCase$invoke$1.L$3 = wSGetReactionResponse2;
                                    syncMessageReactionUseCase$invoke$1.L$4 = it2;
                                    syncMessageReactionUseCase$invoke$1.L$5 = wSSendReactionResponse;
                                    syncMessageReactionUseCase$invoke$1.L$6 = arrayList;
                                    syncMessageReactionUseCase$invoke$1.label = 5;
                                    if (smf2.copydefault(arrayList, syncMessageReactionUseCase$invoke$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    it5 = it2;
                                    C44124sEe.imLogSync$default("Inserted " + arrayList.size() + " new reactions for message " + wSSendReactionResponse.EZpvd(), null, str6, 2, null);
                                    it2 = it5;
                                    wSGetReactionResponse = wSGetReactionResponse2;
                                    i = 2;
                                    th2 = null;
                                    i4 = i;
                                    c44501sSd = c44501sSd2;
                                    it = it2;
                                    th3 = th2;
                                    z2 = z;
                                    if (it.hasNext()) {
                                        java.util.List<WSSendReactionResponse> reactionList = wSGetReactionResponse.getReactionList();
                                        java.util.ArrayList<WSSendReactionResponse> arrayList3 = new java.util.ArrayList();
                                        for (java.lang.Object obj : reactionList) {
                                            if (((WSSendReactionResponse) obj).KWHzl() > 0) {
                                                arrayList3.add(obj);
                                            }
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList3, 10)), 16));
                                        for (WSSendReactionResponse wSSendReactionResponse3 : arrayList3) {
                                            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(wSSendReactionResponse3.EZpvd()), wSSendReactionResponse3.copydefault());
                                            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                                        }
                                        mapKWHzl = linkedHashMap;
                                        objM7377constructorimpl = Result.m7377constructorimpl(mapKWHzl);
                                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                        if (thM7380exceptionOrNullimpl != null) {
                                            C44124sEe.AEQbTJ("Failed to get message reactions: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl, str6);
                                        }
                                        return objM7377constructorimpl;
                                    }
                                }
                            }
                            wSGetReactionResponse = wSGetReactionResponse2;
                            i = 2;
                            th2 = null;
                            i4 = i;
                            c44501sSd = c44501sSd2;
                            it = it2;
                            th3 = th2;
                            z2 = z;
                            if (it.hasNext()) {
                            }
                        }
                        z = z2;
                        long jEZpvd3 = wSSendReactionResponse.EZpvd();
                        i = 2;
                        th2 = null;
                        C44124sEe.imLogSync$default("Skipping reaction update for unknown message seq " + jEZpvd3, null, str6, 2, null);
                        wSGetReactionResponse = wSGetReactionResponse3;
                        c44501sSd2 = c44501sSd3;
                        java.lang.String str13 = str3;
                        it2 = it4;
                        strCopydefault = str13;
                        i4 = i;
                        c44501sSd = c44501sSd2;
                        it = it2;
                        th3 = th2;
                        z2 = z;
                        if (it.hasNext()) {
                        }
                    }
                }
            } else {
                WSSendReactionResponse wSSendReactionResponse4 = (WSSendReactionResponse) syncMessageReactionUseCase$invoke$1.L$5;
                java.util.Iterator it6 = (java.util.Iterator) syncMessageReactionUseCase$invoke$1.L$4;
                WSGetReactionResponse wSGetReactionResponse4 = (WSGetReactionResponse) syncMessageReactionUseCase$invoke$1.L$3;
                java.lang.String str14 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$2;
                C44501sSd c44501sSd6 = (C44501sSd) syncMessageReactionUseCase$invoke$1.L$1;
                java.lang.String str15 = (java.lang.String) syncMessageReactionUseCase$invoke$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    it3 = it6;
                    wSSendReactionResponse = wSSendReactionResponse4;
                    str6 = str15;
                    c44501sSd3 = c44501sSd6;
                    str3 = str14;
                    wSGetReactionResponse3 = wSGetReactionResponse4;
                    it4 = it3;
                    str4 = (java.lang.String) objEZpvd;
                    if (str4 != null) {
                        smf = c44501sSd3.EZpvd;
                        syncMessageReactionUseCase$invoke$1.L$0 = str6;
                        syncMessageReactionUseCase$invoke$1.L$1 = c44501sSd3;
                        syncMessageReactionUseCase$invoke$1.L$2 = str3;
                        syncMessageReactionUseCase$invoke$1.L$3 = wSGetReactionResponse3;
                        syncMessageReactionUseCase$invoke$1.L$4 = it4;
                        syncMessageReactionUseCase$invoke$1.L$5 = wSSendReactionResponse;
                        syncMessageReactionUseCase$invoke$1.L$6 = str4;
                        syncMessageReactionUseCase$invoke$1.label = 3;
                        if (smf.copydefault(str4, syncMessageReactionUseCase$invoke$1) == objCopydefault) {
                        }
                        c44486sRp = c44501sSd3.KWHzl;
                        jEZpvd = wSSendReactionResponse.EZpvd();
                        jKWHzl = wSSendReactionResponse.KWHzl();
                        syncMessageReactionUseCase$invoke$1.L$0 = str6;
                        syncMessageReactionUseCase$invoke$1.L$1 = c44501sSd3;
                        syncMessageReactionUseCase$invoke$1.L$2 = str3;
                        syncMessageReactionUseCase$invoke$1.L$3 = wSGetReactionResponse3;
                        syncMessageReactionUseCase$invoke$1.L$4 = it4;
                        syncMessageReactionUseCase$invoke$1.L$5 = wSSendReactionResponse;
                        syncMessageReactionUseCase$invoke$1.L$6 = str4;
                        syncMessageReactionUseCase$invoke$1.label = 4;
                        if (c44486sRp.copydefault(str6, jEZpvd, jKWHzl, syncMessageReactionUseCase$invoke$1) == objCopydefault) {
                        }
                        java.lang.String str10222 = str3;
                        it2 = it4;
                        strCopydefault = str10222;
                        C44501sSd c44501sSd5222 = c44501sSd3;
                        wSGetReactionResponse2 = wSGetReactionResponse3;
                        c44501sSd2 = c44501sSd5222;
                        if (wSSendReactionResponse.KWHzl() != 0) {
                        }
                        wSGetReactionResponse = wSGetReactionResponse2;
                        i = 2;
                        th2 = null;
                        i4 = i;
                        c44501sSd = c44501sSd2;
                        it = it2;
                        th3 = th2;
                        z2 = z;
                        if (it.hasNext()) {
                        }
                    }
                    z = z2;
                    long jEZpvd32 = wSSendReactionResponse.EZpvd();
                    i = 2;
                    th2 = null;
                    C44124sEe.imLogSync$default("Skipping reaction update for unknown message seq " + jEZpvd32, null, str6, 2, null);
                    wSGetReactionResponse = wSGetReactionResponse3;
                    c44501sSd2 = c44501sSd3;
                    java.lang.String str132 = str3;
                    it2 = it4;
                    strCopydefault = str132;
                    i4 = i;
                    c44501sSd = c44501sSd2;
                    it = it2;
                    th3 = th2;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    str2 = str15;
                    Result.Application application2222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    str6 = str2;
                }
            }
            Result.Application application22222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            str6 = str2;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return objM7377constructorimpl;
        }
        wSGetReactionResponse = (WSGetReactionResponse) objEZpvd;
        if (wSGetReactionResponse == null) {
            mapKWHzl = C56424yEw.KWHzl();
            objM7377constructorimpl = Result.m7377constructorimpl(mapKWHzl);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return objM7377constructorimpl;
        }
        strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
        it = wSGetReactionResponse.getReactionList().iterator();
        if (it.hasNext()) {
        }
    }
}
