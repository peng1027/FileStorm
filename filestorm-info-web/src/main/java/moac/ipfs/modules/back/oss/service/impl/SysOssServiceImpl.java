/**
 * Copyright 2018 http://www.moacipfs.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package moac.ipfs.modules.back.oss.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moac.ipfs.common.utils.PageUtils;
import moac.ipfs.common.utils.Query;
import moac.ipfs.modules.back.oss.dao.SysOssDao;
import moac.ipfs.modules.back.oss.entity.SysOssEntity;
import moac.ipfs.modules.back.oss.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<SysOssEntity> page = this.selectPage(
				new Query<SysOssEntity>(params).getPage()
		);

		return new PageUtils(page);
	}
	
}
