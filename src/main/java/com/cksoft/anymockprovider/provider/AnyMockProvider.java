package com.cksoft.anymockprovider.provider;

import org.powermock.api.mockito.PowerMockito;

public class AnyMockProvider<T> {

	public T provideMockToMe(Class<T> clazz) {
		return PowerMockito.mock(clazz);
	}

}
