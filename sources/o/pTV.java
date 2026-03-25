package o;

import com.okinc.localization2.ResolverForMMKV$onAfterUnzip$1;
import com.okinc.localization2.ResolverForMMKV$onAfterUnzip$3$1;
import com.okinc.localization2.bean.LanguagePackType;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.StringArrayType;
import com.okinc.localization2.bean.StringKVDTO;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.tencent.mmkv.MMKV;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.pTE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pTV implements pTE {
    public final CoroutineDispatcher EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final android.content.Context OLrzqt;
    public final pUE copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LanguagePackType.values().length];
            try {
                iArr[LanguagePackType.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LanguagePackType.START_UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return ".crc";
    }

    public boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return pTE.Activity.AEQbTJ(this, str, str2);
    }

    @yCM
    public pTV(@NotNull android.content.Context context, @NotNull pUE pue, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pue, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.OLrzqt = context;
        this.copydefault = pue;
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = coroutineDispatcher2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x018f -> B:31:0x0199). Please report as a decompilation issue!!! */
    @Override // o.pTE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.io.File file, @NotNull LanguageUnit languageUnit, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ResolverForMMKV$onAfterUnzip$1 resolverForMMKV$onAfterUnzip$1;
        LanguageUnit languageUnit2;
        java.util.ArrayList arrayList;
        java.util.ArrayList<java.lang.Object> arrayList2;
        long jCurrentTimeMillis;
        java.util.ArrayList arrayList3;
        java.util.Iterator it;
        java.lang.String str2;
        java.util.ArrayList<java.lang.String> arrayList4;
        ResolverForMMKV$onAfterUnzip$1 resolverForMMKV$onAfterUnzip$12;
        pTV ptv;
        java.io.File file2;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        java.util.ArrayList arrayList7;
        java.util.ArrayList<java.lang.Integer> arrayList8;
        java.io.File file3;
        MMKV mmkv;
        long j;
        java.util.ArrayList arrayList9;
        java.util.ArrayList arrayList10;
        java.io.BufferedReader bufferedReader;
        long j2;
        if (continuation instanceof ResolverForMMKV$onAfterUnzip$1) {
            resolverForMMKV$onAfterUnzip$1 = (ResolverForMMKV$onAfterUnzip$1) continuation;
            int i = resolverForMMKV$onAfterUnzip$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolverForMMKV$onAfterUnzip$1.label = i - Integer.MIN_VALUE;
            } else {
                resolverForMMKV$onAfterUnzip$1 = new ResolverForMMKV$onAfterUnzip$1(this, continuation);
            }
        }
        java.lang.Object obj = resolverForMMKV$onAfterUnzip$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolverForMMKV$onAfterUnzip$1.label;
        java.lang.String str3 = "ResolverForMMKV";
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("onAfterUnzip, mmkv generate, start. for ");
            languageUnit2 = languageUnit;
            sb.append(languageUnit2);
            sb.append(", from:");
            sb.append(str);
            pUU.KWHzl("ResolverForMMKV", sb.toString());
            java.util.ArrayList arrayList11 = new java.util.ArrayList(50000);
            arrayList = new java.util.ArrayList(50000);
            java.util.ArrayList arrayList12 = new java.util.ArrayList(50000);
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.util.ArrayList<java.lang.String> arrayList15 = new java.util.ArrayList<>(512);
            arrayList2 = new java.util.ArrayList<>(512);
            java.util.ArrayList<java.lang.Integer> arrayList16 = new java.util.ArrayList<>(512);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            arrayList3 = arrayList13;
            it = C59467zhb.DbNXlk(yFJ.AYXKKw(file), new Function1() { // from class: o.pUa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(pTV.copydefault((java.io.File) obj2));
                }
            }).iterator();
            str2 = "ResolverForMMKV";
            arrayList4 = arrayList15;
            resolverForMMKV$onAfterUnzip$12 = resolverForMMKV$onAfterUnzip$1;
            ptv = this;
            file2 = file;
            arrayList5 = arrayList12;
            arrayList6 = arrayList11;
            arrayList7 = arrayList14;
            arrayList8 = arrayList16;
            java.lang.String str4 = str2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = resolverForMMKV$onAfterUnzip$1.J$0;
                mmkv = (MMKV) resolverForMMKV$onAfterUnzip$1.L$1;
                file3 = (java.io.File) resolverForMMKV$onAfterUnzip$1.L$0;
                C56391yDq.AEQbTJ(obj);
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                pUU.KWHzl(str3, "onAfterUnzip, mmkv generate finish for " + file3 + ". cost:" + (jCurrentTimeMillis2 - j) + ". size:" + mmkv.OLrzqt());
                return Unit.INSTANCE;
            }
            long j3 = resolverForMMKV$onAfterUnzip$1.J$0;
            it = (java.util.Iterator) resolverForMMKV$onAfterUnzip$1.L$11;
            java.util.ArrayList<java.lang.Integer> arrayList17 = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$10;
            arrayList2 = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$9;
            java.util.ArrayList<java.lang.String> arrayList18 = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$8;
            java.util.ArrayList arrayList19 = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$7;
            java.util.ArrayList arrayList20 = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$6;
            java.util.ArrayList arrayList21 = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$5;
            arrayList = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$4;
            arrayList6 = (java.util.ArrayList) resolverForMMKV$onAfterUnzip$1.L$3;
            LanguageUnit languageUnit3 = (LanguageUnit) resolverForMMKV$onAfterUnzip$1.L$2;
            java.io.File file4 = (java.io.File) resolverForMMKV$onAfterUnzip$1.L$1;
            pTV ptv2 = (pTV) resolverForMMKV$onAfterUnzip$1.L$0;
            C56391yDq.AEQbTJ(obj);
            file2 = file4;
            java.util.ArrayList arrayList22 = arrayList20;
            languageUnit2 = languageUnit3;
            resolverForMMKV$onAfterUnzip$12 = resolverForMMKV$onAfterUnzip$1;
            ptv = ptv2;
            arrayList8 = arrayList17;
            java.lang.Object obj2 = objCopydefault;
            java.lang.String str5 = "ResolverForMMKV";
            arrayList4 = arrayList18;
            arrayList7 = arrayList19;
            jCurrentTimeMillis = j3;
            arrayList5 = arrayList21;
            arrayList3 = arrayList22;
            java.lang.Object obj3 = obj2;
            str2 = str5;
            objCopydefault = obj3;
            java.lang.String str42 = str2;
            if (it.hasNext()) {
                java.lang.Object obj4 = objCopydefault;
                java.io.Reader fileReader = new java.io.FileReader((java.io.File) it.next());
                try {
                    try {
                        if (fileReader instanceof java.io.BufferedReader) {
                            bufferedReader = (java.io.BufferedReader) fileReader;
                            j2 = jCurrentTimeMillis;
                        } else {
                            j2 = jCurrentTimeMillis;
                            bufferedReader = new java.io.BufferedReader(fileReader, 8192);
                        }
                        java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                        yFA.copydefault(bufferedReader, null);
                        yFA.copydefault(fileReader, null);
                        CoroutineDispatcher coroutineDispatcher = ptv.KWHzl;
                        ResolverForMMKV$onAfterUnzip$3$1 resolverForMMKV$onAfterUnzip$3$1 = new ResolverForMMKV$onAfterUnzip$3$1(strAEQbTJ, ptv, arrayList6, arrayList, arrayList3, arrayList4, arrayList2, arrayList8, arrayList5, arrayList7, null);
                        resolverForMMKV$onAfterUnzip$12.L$0 = ptv;
                        resolverForMMKV$onAfterUnzip$12.L$1 = file2;
                        resolverForMMKV$onAfterUnzip$12.L$2 = languageUnit2;
                        resolverForMMKV$onAfterUnzip$12.L$3 = arrayList6;
                        resolverForMMKV$onAfterUnzip$12.L$4 = arrayList;
                        java.util.ArrayList arrayList23 = arrayList5;
                        resolverForMMKV$onAfterUnzip$12.L$5 = arrayList23;
                        resolverForMMKV$onAfterUnzip$12.L$6 = arrayList3;
                        resolverForMMKV$onAfterUnzip$12.L$7 = arrayList7;
                        resolverForMMKV$onAfterUnzip$12.L$8 = arrayList4;
                        resolverForMMKV$onAfterUnzip$12.L$9 = arrayList2;
                        resolverForMMKV$onAfterUnzip$12.L$10 = arrayList8;
                        resolverForMMKV$onAfterUnzip$12.L$11 = it;
                        jCurrentTimeMillis = j2;
                        resolverForMMKV$onAfterUnzip$12.J$0 = jCurrentTimeMillis;
                        java.util.Iterator it2 = it;
                        resolverForMMKV$onAfterUnzip$12.label = 1;
                        java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcher, resolverForMMKV$onAfterUnzip$3$1, resolverForMMKV$onAfterUnzip$12);
                        obj2 = obj4;
                        if (objWithContext == obj2) {
                            return obj2;
                        }
                        it = it2;
                        str5 = str42;
                        arrayList22 = arrayList3;
                        arrayList21 = arrayList23;
                        arrayList5 = arrayList21;
                        arrayList3 = arrayList22;
                        java.lang.Object obj32 = obj2;
                        str2 = str5;
                        objCopydefault = obj32;
                        java.lang.String str422 = str2;
                        if (it.hasNext()) {
                            java.util.ArrayList arrayList24 = arrayList5;
                            java.lang.Object obj5 = objCopydefault;
                            pUU.KWHzl(str422, "onAfterUnzip, mmkv generate, 1");
                            MMKV mmkvKWHzl = MMKV.KWHzl("languagePack", file2.getCanonicalPath());
                            Intrinsics.checkNotNullExpressionValue(mmkvKWHzl, "");
                            java.util.ArrayList<java.lang.Integer> arrayList25 = arrayList8;
                            java.util.ArrayList<java.lang.Object> arrayList26 = arrayList2;
                            MMKV mmkvKWHzl2 = MMKV.KWHzl("languageConfig", file2.getCanonicalPath());
                            Intrinsics.checkNotNullExpressionValue(mmkvKWHzl2, "");
                            MMKV mmkvEZpvd = MMKV.EZpvd("commonConfig");
                            Intrinsics.checkNotNullExpressionValue(mmkvEZpvd, "");
                            java.util.ArrayList<java.lang.String> arrayList27 = arrayList4;
                            long j4 = jCurrentTimeMillis;
                            mmkvEZpvd.KWHzl(ptv.OLrzqt(languageUnit2), arrayList6.size());
                            java.lang.String[] strArrAEQbTJ = mmkvKWHzl.AEQbTJ();
                            Ref.IntRef intRef = new Ref.IntRef();
                            Ref.IntRef intRef2 = new Ref.IntRef();
                            java.io.File file5 = file2;
                            Ref.IntRef intRef3 = new Ref.IntRef();
                            ResolverForMMKV$onAfterUnzip$1 resolverForMMKV$onAfterUnzip$13 = resolverForMMKV$onAfterUnzip$12;
                            int i3 = 0;
                            for (java.lang.Object obj6 : arrayList6) {
                                if (i3 < 0) {
                                    yDY.AYXKKw();
                                }
                                pTV ptv3 = ptv;
                                java.lang.String str6 = (java.lang.String) obj6;
                                MMKV mmkv2 = mmkvEZpvd;
                                java.lang.Object obj7 = arrayList.get(i3);
                                Intrinsics.checkNotNullExpressionValue(obj7, "");
                                int iIntValue = ((java.lang.Number) obj7).intValue();
                                mmkvKWHzl2.KWHzl(str6, iIntValue);
                                if (iIntValue != 0) {
                                    arrayList9 = arrayList;
                                    if (iIntValue == 1) {
                                        int i4 = intRef2.element;
                                        intRef2.element = i4 + 1;
                                        mmkvKWHzl.EZpvd(str6, (java.lang.String) arrayList3.get(i4));
                                    } else if (iIntValue == 2) {
                                        int i5 = intRef3.element;
                                        intRef3.element = i5 + 1;
                                        mmkvKWHzl.OLrzqt(str6, (android.os.Parcelable) arrayList7.get(i5));
                                    }
                                    arrayList10 = arrayList24;
                                } else {
                                    arrayList9 = arrayList;
                                    int i6 = intRef.element;
                                    intRef.element = i6 + 1;
                                    arrayList10 = arrayList24;
                                    mmkvKWHzl.EZpvd(str6, (java.lang.String) arrayList10.get(i6));
                                }
                                i3++;
                                arrayList24 = arrayList10;
                                mmkvEZpvd = mmkv2;
                                ptv = ptv3;
                                arrayList = arrayList9;
                            }
                            pTV ptv4 = ptv;
                            MMKV mmkv3 = mmkvEZpvd;
                            if (strArrAEQbTJ != null) {
                                java.util.Set setKWHzl = yDV.KWHzl((java.lang.Object[]) strArrAEQbTJ, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList6));
                                java.util.Set set = setKWHzl;
                                if (!set.isEmpty()) {
                                    mmkvKWHzl.removeValuesForKeys((java.lang.String[]) set.toArray(new java.lang.String[0]));
                                    pUU.KWHzl(str422, "onAfterUnzip, removed " + setKWHzl.size() + " unused keys for " + languageUnit2);
                                }
                            }
                            C38304pTv c38304pTv = C38304pTv.KWHzl;
                            c38304pTv.KWHzl(mmkvKWHzl);
                            c38304pTv.KWHzl(mmkvKWHzl2);
                            c38304pTv.KWHzl(mmkv3);
                            pUE pue = ptv4.copydefault;
                            java.lang.String languageCode = languageUnit2.getLanguageCode();
                            file3 = file5;
                            resolverForMMKV$onAfterUnzip$13.L$0 = file3;
                            resolverForMMKV$onAfterUnzip$13.L$1 = mmkvKWHzl;
                            resolverForMMKV$onAfterUnzip$13.L$2 = null;
                            resolverForMMKV$onAfterUnzip$13.L$3 = null;
                            resolverForMMKV$onAfterUnzip$13.L$4 = null;
                            resolverForMMKV$onAfterUnzip$13.L$5 = null;
                            resolverForMMKV$onAfterUnzip$13.L$6 = null;
                            resolverForMMKV$onAfterUnzip$13.L$7 = null;
                            resolverForMMKV$onAfterUnzip$13.L$8 = null;
                            resolverForMMKV$onAfterUnzip$13.L$9 = null;
                            resolverForMMKV$onAfterUnzip$13.L$10 = null;
                            resolverForMMKV$onAfterUnzip$13.L$11 = null;
                            resolverForMMKV$onAfterUnzip$13.J$0 = j4;
                            resolverForMMKV$onAfterUnzip$13.label = 2;
                            if (pue.KWHzl(languageCode, arrayList27, arrayList26, arrayList25, resolverForMMKV$onAfterUnzip$13) == obj5) {
                                return obj5;
                            }
                            str3 = str422;
                            mmkv = mmkvKWHzl;
                            j = j4;
                            long jCurrentTimeMillis22 = java.lang.System.currentTimeMillis();
                            pUU.KWHzl(str3, "onAfterUnzip, mmkv generate finish for " + file3 + ". cost:" + (jCurrentTimeMillis22 - j) + ". size:" + mmkv.OLrzqt());
                            return Unit.INSTANCE;
                        }
                    } finally {
                    }
                } finally {
                }
            }
        }
    }

    public static final boolean copydefault(java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return pTG.OLrzqt.AEQbTJ(file);
    }

    public final java.lang.String OLrzqt(LanguageUnit languageUnit) {
        return "expected_count_" + languageUnit.getMarket() + "_" + languageUnit.getLanguageCode();
    }

    public final void OLrzqt(java.util.List<java.lang.String> list, java.util.List<java.lang.Object> list2, java.util.List<java.lang.Integer> list3, java.util.List<java.lang.String> list4, int i, java.lang.String str, java.lang.Object obj) {
        if (list4.isEmpty() || !list4.contains(str)) {
            return;
        }
        list.add(str);
        list2.add(obj);
        list3.add(java.lang.Integer.valueOf(i));
    }

    @Override // o.pTE
    public java.lang.Object copydefault(@NotNull pSI psi, @NotNull LanguageUnit languageUnit, @NotNull LanguagePackType languagePackType, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("ResolverForMMKV", "loadLangPack, start load language pack for:" + languageUnit + ". langPackType:" + languagePackType);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (!copydefault(languageUnit, languagePackType == LanguagePackType.START_UP)) {
            return C56443yFo.KWHzl(false);
        }
        try {
            MMKV mmkvOLrzqt = OLrzqt(languageUnit, languagePackType);
            MMKV mmkvAEQbTJ = AEQbTJ(languageUnit, languagePackType);
            if (mmkvOLrzqt.OLrzqt() != 0 && mmkvAEQbTJ.OLrzqt() != 0) {
                pUU.KWHzl("ResolverForMMKV", "loadLangPack, get instance. cost:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + ". count:" + mmkvAEQbTJ.OLrzqt());
                java.lang.String[] strArrAEQbTJ = mmkvAEQbTJ.AEQbTJ();
                if (strArrAEQbTJ != null) {
                    for (java.lang.String str : strArrAEQbTJ) {
                        int iOLrzqt = mmkvOLrzqt.OLrzqt(str);
                        if (iOLrzqt == 0) {
                            java.lang.String strKWHzl = mmkvAEQbTJ.KWHzl(str);
                            if (strKWHzl != null) {
                                Intrinsics.copydefault((java.lang.Object) str);
                                psi.copydefault(str, strKWHzl);
                            }
                        } else if (iOLrzqt == 1) {
                            java.lang.String strKWHzl2 = mmkvAEQbTJ.KWHzl(str);
                            if (strKWHzl2 != null) {
                                Intrinsics.copydefault((java.lang.Object) str);
                                psi.KWHzl(str, strKWHzl2);
                            }
                        } else if (iOLrzqt == 2) {
                            StringArrayType stringArrayType = (StringArrayType) mmkvAEQbTJ.copydefault(str, StringArrayType.class);
                            if (stringArrayType != null) {
                                Intrinsics.copydefault((java.lang.Object) str);
                                psi.KWHzl(str, stringArrayType.getValues());
                            }
                        } else {
                            pTL.copydefault(new java.lang.UnsupportedOperationException("loadLangPack, unknown type:" + iOLrzqt), null);
                        }
                    }
                }
                pUU.KWHzl("ResolverForMMKV", "loadLangPack, 2 cost:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
                return C56443yFo.KWHzl(true);
            }
            pUU.copydefault("ResolverForMMKV", "loadLangPack, mmkv file is empty.lcKV:" + mmkvOLrzqt.OLrzqt() + ",lpKV:" + mmkvAEQbTJ.OLrzqt() + JwtUtilsKt.JWT_DELIMITER);
            return C56443yFo.KWHzl(false);
        } catch (java.lang.Exception unused) {
            return C56443yFo.KWHzl(false);
        }
    }

    @Override // o.pTE
    public long KWHzl(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        return AEQbTJ(languageUnit, LanguagePackType.NORMAL).OLrzqt();
    }

    @Override // o.pTE
    public long AEQbTJ(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        MMKV mmkvEZpvd = MMKV.EZpvd("commonConfig");
        Intrinsics.checkNotNullExpressionValue(mmkvEZpvd, "");
        return mmkvEZpvd.AEQbTJ(OLrzqt(languageUnit));
    }

    public final MMKV OLrzqt(LanguageUnit languageUnit, LanguagePackType languagePackType) {
        int i = Application.KWHzl[languagePackType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return this.copydefault.OLrzqt(languageUnit.getLanguageCode()).getFirst();
        }
        MMKV mmkvKWHzl = MMKV.KWHzl("languageConfig", new java.io.File(pTG.OLrzqt.AEQbTJ(this.OLrzqt, languageUnit)).getCanonicalPath());
        Intrinsics.checkNotNullExpressionValue(mmkvKWHzl, "");
        return mmkvKWHzl;
    }

    public final MMKV AEQbTJ(LanguageUnit languageUnit, LanguagePackType languagePackType) {
        int i = Application.KWHzl[languagePackType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return this.copydefault.OLrzqt(languageUnit.getLanguageCode()).getSecond();
        }
        MMKV mmkvKWHzl = MMKV.KWHzl("languagePack", new java.io.File(pTG.OLrzqt.AEQbTJ(this.OLrzqt, languageUnit)).getCanonicalPath());
        Intrinsics.checkNotNullExpressionValue(mmkvKWHzl, "");
        return mmkvKWHzl;
    }

    public final StringKVDTO copydefault(java.lang.String str, java.lang.String str2) {
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "plural,", false, 2, (java.lang.Object) null)) {
            return new StringKVDTO(str, str2, false);
        }
        java.lang.String strReplace$default = str2;
        for (java.lang.String str3 : C38313pUd.Companion.copydefault()) {
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strReplace$default, (java.lang.CharSequence) str3, false, 2, (java.lang.Object) null)) {
                strReplace$default = C59449zhJ.replace$default(strReplace$default, str3, "", false, 4, (java.lang.Object) null);
            }
        }
        if (KWHzl(str, strReplace$default)) {
            return new StringKVDTO(str, strReplace$default, true);
        }
        return new StringKVDTO(str, strReplace$default, false);
    }

    @Override // o.pTE
    public boolean copydefault(@NotNull LanguageUnit languageUnit, boolean z) throws java.io.IOException {
        java.io.File file;
        Intrinsics.checkNotNullParameter(languageUnit, "");
        if (z) {
            file = new java.io.File(pTG.OLrzqt.OLrzqt(this.OLrzqt, languageUnit.getLanguageCode()));
        } else {
            file = new java.io.File(pTG.OLrzqt.AEQbTJ(this.OLrzqt, languageUnit));
        }
        if (!file.exists()) {
            pUU.KWHzl("ResolverForMMKV", "hasLangPackFile, dir:" + file.getCanonicalPath() + " doesn't exist. languageUnit:" + languageUnit + ", isStartup:" + z);
            return false;
        }
        if (!file.isDirectory()) {
            pUU.KWHzl("ResolverForMMKV", "hasLangPackFile, dir:" + file.getCanonicalPath() + " is not dirlanguageUnit:" + languageUnit + ", isStartup:" + z);
            return false;
        }
        try {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (java.io.File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        java.lang.String name = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        if (C59449zhJ.valueOf(name, EZpvd(), true)) {
                            long jOLrzqt = AEQbTJ(languageUnit, z ? LanguagePackType.START_UP : LanguagePackType.NORMAL).OLrzqt();
                            if (jOLrzqt > 0) {
                                return true;
                            }
                            pUU.valueOf("ResolverForMMKV", "hasLangPackFile, mmkv count <= 0. count:" + jOLrzqt + ", languageUnit:" + languageUnit + ", isStartup:" + z);
                            return false;
                        }
                    }
                }
            }
            java.lang.String string = java.util.Arrays.toString(fileArrListFiles);
            Intrinsics.checkNotNullExpressionValue(string, "");
            pUU.valueOf("ResolverForMMKV", "hasLangPackFile, doesn't have crc file:" + string + ", languageUnit:" + languageUnit + ", isStartup:" + z);
            return false;
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("ResolverForMMKV", "hasLangPackFile", e);
            return false;
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
