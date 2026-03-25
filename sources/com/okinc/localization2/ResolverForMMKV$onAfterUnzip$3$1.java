package com.okinc.localization2;

import com.okinc.localization2.bean.StringArrayType;
import com.okinc.localization2.bean.StringKVDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oJV;
import o.pTV;
import o.pUE;

/* JADX INFO: loaded from: classes9.dex */
public final class ResolverForMMKV$onAfterUnzip$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $jsonStr;
    final /* synthetic */ ArrayList<Integer> $keyType;
    final /* synthetic */ ArrayList<String> $keys;
    final /* synthetic */ ArrayList<String> $pluralValues;
    final /* synthetic */ ArrayList<String> $startupKeys;
    final /* synthetic */ ArrayList<Integer> $startupTypes;
    final /* synthetic */ ArrayList<Object> $startupValue;
    final /* synthetic */ ArrayList<StringArrayType> $stringArrayValues;
    final /* synthetic */ ArrayList<String> $stringValues;
    Object L$0;
    int label;
    final /* synthetic */ pTV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolverForMMKV$onAfterUnzip$3$1(String str, pTV ptv, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<Object> arrayList5, ArrayList<Integer> arrayList6, ArrayList<String> arrayList7, ArrayList<StringArrayType> arrayList8, Continuation<? super ResolverForMMKV$onAfterUnzip$3$1> continuation) {
        super(2, continuation);
        this.$jsonStr = str;
        this.this$0 = ptv;
        this.$keys = arrayList;
        this.$keyType = arrayList2;
        this.$pluralValues = arrayList3;
        this.$startupKeys = arrayList4;
        this.$startupValue = arrayList5;
        this.$startupTypes = arrayList6;
        this.$stringValues = arrayList7;
        this.$stringArrayValues = arrayList8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResolverForMMKV$onAfterUnzip$3$1(this.$jsonStr, this.this$0, this.$keys, this.$keyType, this.$pluralValues, this.$startupKeys, this.$startupValue, this.$startupTypes, this.$stringValues, this.$stringArrayValues, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResolverForMMKV$onAfterUnzip$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        JsonObject jsonObject;
        ArrayList<StringArrayType> arrayList;
        ArrayList<String> arrayList2;
        ArrayList<Integer> arrayList3;
        ArrayList<Object> arrayList4;
        ArrayList<String> arrayList5;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jsonObject = (JsonObject) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        } else {
            C56391yDq.AEQbTJ(obj);
            JsonObject jsonObject2 = JsonElementKt.getJsonObject(oJV.AEQbTJ.DbNXlk().parseToJsonElement(this.$jsonStr));
            pUE pue = this.this$0.copydefault;
            this.L$0 = jsonObject2;
            this.label = 1;
            objKWHzl = pue.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            jsonObject = jsonObject2;
        }
        List list = (List) objKWHzl;
        Set<Map.Entry<String, JsonElement>> setEntrySet = jsonObject.entrySet();
        pTV ptv = this.this$0;
        ArrayList<String> arrayList6 = this.$keys;
        ArrayList<Integer> arrayList7 = this.$keyType;
        ArrayList<String> arrayList8 = this.$pluralValues;
        ArrayList<String> arrayList9 = this.$startupKeys;
        ArrayList<Object> arrayList10 = this.$startupValue;
        ArrayList<Integer> arrayList11 = this.$startupTypes;
        ArrayList<String> arrayList12 = this.$stringValues;
        ArrayList<StringArrayType> arrayList13 = this.$stringArrayValues;
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof JsonPrimitive) {
                StringKVDTO stringKVDTOCopydefault = ptv.copydefault((String) entry.getKey(), ((JsonPrimitive) jsonElement).getContent());
                arrayList6.add(stringKVDTOCopydefault.getKey());
                if (stringKVDTOCopydefault.isPlural()) {
                    arrayList7.add(C56443yFo.AEQbTJ(i2));
                    arrayList8.add(stringKVDTOCopydefault.getValue());
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList5 = arrayList9;
                    ptv.OLrzqt(arrayList9, arrayList10, arrayList11, list, 1, stringKVDTOCopydefault.getKey(), stringKVDTOCopydefault.getValue());
                } else {
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList5 = arrayList9;
                    arrayList7.add(C56443yFo.AEQbTJ(0));
                    arrayList2.add(stringKVDTOCopydefault.getValue());
                    ptv.OLrzqt(arrayList5, arrayList4, arrayList3, list, 0, stringKVDTOCopydefault.getKey(), stringKVDTOCopydefault.getValue());
                }
            } else {
                arrayList = arrayList13;
                arrayList2 = arrayList12;
                arrayList3 = arrayList11;
                arrayList4 = arrayList10;
                arrayList5 = arrayList9;
                if (jsonElement instanceof JsonArray) {
                    JsonArray jsonArray = (JsonArray) jsonElement;
                    int size = jsonArray.size();
                    String[] strArr = new String[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        strArr[i3] = jsonArray.get(i3).toString();
                    }
                    StringArrayType stringArrayType = new StringArrayType(strArr);
                    arrayList6.add((String) entry.getKey());
                    arrayList7.add(C56443yFo.AEQbTJ(2));
                    arrayList.add(stringArrayType);
                    ptv.OLrzqt(arrayList5, arrayList4, arrayList3, list, 2, (String) entry.getKey(), stringArrayType);
                }
            }
            arrayList12 = arrayList2;
            arrayList13 = arrayList;
            arrayList10 = arrayList4;
            arrayList11 = arrayList3;
            arrayList9 = arrayList5;
            i2 = 1;
        }
        return Unit.INSTANCE;
    }
}
