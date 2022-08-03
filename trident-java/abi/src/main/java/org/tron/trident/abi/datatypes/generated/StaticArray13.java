package org.tron.trident.abi.datatypes.generated;

import org.tron.trident.abi.datatypes.StaticArray;
import org.tron.trident.abi.datatypes.Type;

import java.util.List;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.tron.trident.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray13<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray13(List<T> values) {
        super(13, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray13(T... values) {
        super(13, values);
    }

    public StaticArray13(Class<T> type, List<T> values) {
        super(type, 13, values);
    }

    @SafeVarargs
    public StaticArray13(Class<T> type, T... values) {
        super(type, 13, values);
    }
}
