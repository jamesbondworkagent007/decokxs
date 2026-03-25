package com.okinc.business.defi.dapp.utils;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C15142dyj;
import o.C33129mqd;
import o.C48872udq;
import o.C56391yDq;
import o.C56407yEf;
import o.C56442yFn;
import o.C59449zhJ;
import o.dDN;
import o.yET;

/* JADX INFO: loaded from: classes4.dex */
public final class DappDeeplinkUtils$getRegexJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $jsonName;
    final /* synthetic */ Function0<Unit> $successCallback;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappDeeplinkUtils$getRegexJson$1(String str, Function0<Unit> function0, Continuation<? super DappDeeplinkUtils$getRegexJson$1> continuation) {
        super(2, continuation);
        this.$jsonName = str;
        this.$successCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DappDeeplinkUtils$getRegexJson$1(this.$jsonName, this.$successCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DappDeeplinkUtils$getRegexJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(StringsKt__StringsKt.split$default((CharSequence) ((DappDeeplinkRegexBean) t2).getRegex(), new String[]{"/"}, false, 0, 6, (Object) null).size()), Integer.valueOf(StringsKt__StringsKt.split$default((CharSequence) ((DappDeeplinkRegexBean) t).getRegex(), new String[]{"/"}, false, 0, 6, (Object) null).size()));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                try {
                    String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ(this.$jsonName);
                    if (C33129mqd.OLrzqt((CharSequence) strAEQbTJ)) {
                        File file = new File(strAEQbTJ);
                        if (file.exists() && file.isDirectory() && file.listFiles() != null) {
                            File[] fileArrListFiles = file.listFiles();
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            if (!(fileArrListFiles.length == 0)) {
                                File file2 = file.listFiles()[0];
                                String name = file2.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "");
                                if (C59449zhJ.endsWith$default(name, ".json", false, 2, null) && (strKWHzl = dDN.copydefault.KWHzl(new FileInputStream(file2))) != null) {
                                    C15142dyj c15142dyj = C15142dyj.EZpvd;
                                    c15142dyj.AEQbTJ(new CopyOnWriteArrayList<>((Object[]) new Gson().fromJson(strKWHzl, DappDeeplinkRegexBean[].class)));
                                    CopyOnWriteArrayList<DappDeeplinkRegexBean> copyOnWriteArrayListKWHzl = c15142dyj.KWHzl();
                                    if (copyOnWriteArrayListKWHzl.size() > 1) {
                                        C56407yEf.copydefault(copyOnWriteArrayListKWHzl, new Application());
                                    }
                                }
                            }
                        }
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$successCallback, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (Exception e) {
                    e.getMessage();
                    MainCoroutineDispatcher main2 = Dispatchers.getMain();
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(this.$successCallback, null);
                    this.label = 2;
                    if (BuildersKt.withContext(main2, anonymousClass22, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } catch (Throwable th) {
                MainCoroutineDispatcher main3 = Dispatchers.getMain();
                AnonymousClass2 anonymousClass23 = new AnonymousClass2(this.$successCallback, null);
                this.L$0 = th;
                this.label = 3;
                if (BuildersKt.withContext(main3, anonymousClass23, this) == objCopydefault) {
                    return objCopydefault;
                }
                throw th;
            }
        } else {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.L$0;
                C56391yDq.AEQbTJ(obj);
                throw th2;
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.dapp.utils.DappDeeplinkUtils$getRegexJson$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $successCallback;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$successCallback = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$successCallback, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Function0<Unit> function0 = this.$successCallback;
                if (function0 == null) {
                    return null;
                }
                function0.invoke();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
